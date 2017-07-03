package refactor;

import java.util.List;

/**
 * Created by WU on 2017/7/3.
 * 把原来复杂的条件判断等语句用尽快返回的方式简化代码。
 */
public class Day_30_ReturnASAP {


    /*---------------------------before--------------------------*/
    public class Order {
        public Object Customer;

        public int CalculateOrder(Object customer, List<Object> products, int discounts) {
            Customer = customer;
            int orderTotal = 0;

            if (products.size() > 0) {
                orderTotal = products.size();
                if (discounts > 0) {
                    orderTotal -= discounts;
                }
            }

            return orderTotal;
        }
    }

    /*---------------------------after---------------------------*/
    public class Order2 {
        public Object Customer;

        public int CalculateOrder(Object customer, List<Object> products, int discounts) {
            Customer = customer;
            int orderTotal = 0;

            if (products.size() == 0) {
                return 0;
            }

            orderTotal = products.size();
            if (discounts > 0) {
                orderTotal -= discounts;
            }

            return orderTotal;
        }
    }
}
