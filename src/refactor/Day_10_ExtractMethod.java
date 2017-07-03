package refactor;

import java.util.List;

/**
 * Created by wu on 2017/7/3.
 * 把某些计算复杂的过程按照功能提取成各个小方法，这样就可以使代码的可读性、维护性得到提高。
 */
public class Day_10_ExtractMethod {

    /*---------------------------before--------------------------*/
    class Receipt {
        private List<Float> discounts;
        private List<Float> itemTotals;

        public float CalculateGrandTotal() {
            float subTotal = 0f;
            for (Float itemTotal : itemTotals)
                subTotal += itemTotal;

            if (discounts.size() > 0) {
                for (Float discount : discounts) {
                    subTotal -= discount;
                }
            }

            float tax = subTotal * 0.065f;

            subTotal += tax;

            return subTotal;
        }
    }

    /*---------------------------after---------------------------*/
    class Receipt1 {

        private List<Float> discounts;
        private List<Float> itemTotals;

        public float CalculateGrandTotal() {
            float subTotal = 0f;
            subTotal = addItemTotals(itemTotals);
            subTotal = minuteDiscounts(itemTotals);
            subTotal = calcTax(subTotal);
            return subTotal;
        }

        float addItemTotals(List<Float> itemTotals){

            float subTotal = 0f;
            for (Float itemTotal : itemTotals) {
                subTotal += itemTotal;
            }
            return subTotal;
        }

        float minuteDiscounts(List<Float> discounts){
            float subTotal = 0f;
            if (discounts.size() > 0) {
                for (Float discount : discounts)
                    subTotal -= discount;
            }
            return subTotal;
        }

        float calcTax( float subTotal){
            float tax = subTotal * 0.065f;
            subTotal += tax;
            return subTotal;
        }

    }
}
