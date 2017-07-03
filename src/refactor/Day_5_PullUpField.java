package refactor;

/**
 * Created by wu on 2017/7/3.
 * 如果子类都有相同的属性，那就将属性提上到父类层
 */
public class Day_5_PullUpField {

    /*---------------------------before--------------------------*/
    abstract class Account {
    }

    public class CheckingAccount extends Account {
        private int _minimumCheckingBalance = 5;
    }

    public class SavingsAccount extends Account {
        private int _minimumSavingsBalance = 5;
    }

    /*---------------------------after---------------------------*/
    abstract class Account1 {
        protected int _minimumCheckingBalance = 5;
    }

    public class CheckingAccount1 extends Account1 {

    }

    public class SavingsAccount1 extends Account1 {
    }

}
