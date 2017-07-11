package refactor.Day31;

import java.util.Calendar;
import java.util.List;

/**
 * Created by WU on 2017/7/3.
 * 我们应该对应该对输入和输出进行验证，以确保系统不会出现我们所想象不到的异常和得不到我们想要的结果。
 */
public class Day_25_DesignByContract {

    /*---------------------------before--------------------------*/
    public class CashRegister {
        public int TotalOrder(List<String> products, Calendar calendar) {
            int orderTotal = products.size();

            orderTotal += calendar.get(Calendar.SUNDAY);

            return orderTotal;
        }
    }

    /*---------------------------after---------------------------*/
    public int TotalOrder2(List<String> products, Calendar calendar) {

        if (products == null) {
            throw new NullPointerException("products must not be empty");
        }
        if (products.size() == 0) {
            throw new ArithmeticException("products's size must more than one");
        }
        //calendar校验省略
        int orderTotal = products.size();

        orderTotal += calendar.get(Calendar.SUNDAY);
        //输出校验
        if (orderTotal == 0) {
            throw new SecurityException("orderTotal's value must bigger than 0");
        }

        return orderTotal;
    }
}
