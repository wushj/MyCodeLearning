package refactor;

import java.util.List;

/**
 * Created by wu on 2017/7/3.
 * 把我们所做的这个功能不停的分解方法，直到将一个大方法分解为名字有意义且可读性更好的若干个小方法。
 */
public class Day_22_BreakMethod {

    /*---------------------------before--------------------------*/
    public class CashRegister {
        public CashRegister() {
            Tax = 0.06f;
        }

        private float Tax;

        public void AcceptPayment(Customer customer, List<Product> products, int payment) {
            float subTotal = 0f;
            for (Product product : products) {
                subTotal += product.Price;
            }

            for (Product product : products) {
                subTotal -= product.AvailableDiscounts;
            }

            float grandTotal = subTotal * Tax;

            customer.DeductFromAccountBalance(grandTotal);
        }
    }

    public class Customer {
        public void DeductFromAccountBalance(float amount) {
            // deduct from balance
        }
    }

    public class Product {
        public int Price;
        public int AvailableDiscounts;
    }

    /*---------------------------after---------------------------*/
    public class CashRegister2 {
        public CashRegister2() {
            Tax = 0.06f;
        }

        private float Tax;
        private List<Product> Products;

        public void AcceptPayment(Customer customer, List<Product> products, int payment) {
            int subTotal = CalculateSubtotal();

            subTotal = SubtractDiscounts(subTotal);

            float grandTotal = AddTax(subTotal);

            SubtractFromCustomerBalance(customer, grandTotal);
        }

        private void SubtractFromCustomerBalance(Customer customer, float grandTotal) {
            customer.DeductFromAccountBalance(grandTotal);
        }

        private float AddTax(int subTotal) {
            return subTotal * Tax;
        }

        private int SubtractDiscounts(int subTotal) {
            for (Product product : Products) {
                subTotal -= product.AvailableDiscounts;
            }
            return subTotal;
        }

        private int CalculateSubtotal() {
            int subTotal = 0;
            for (Product product : Products) {
                subTotal += product.Price;
            }
            return subTotal;
        }
    }

}
