package refactor.Day31;

/**
 * Created by WU on 2017/7/3.
 * 如果一个方法带有大量的bool 参数时，可以根据bool 参数的数量，提取出若干个独立的方法来简化参数。
 */
public class Day_28_RenameBooleanMethod {


    /*---------------------------before--------------------------*/
    public class BankAccount {
        public void createAccount(Object customer, boolean withChecking, boolean withSavings) {
            // do work
        }
    }

    /*---------------------------after---------------------------*/
    public class BankAccount2 {
        public void createAccountWithChecking(Object customer) {
            createAccount(customer, true, false);
        }

        public void CreateAccountWithCheckingAndSavings(Object customer) {
            createAccount(customer, true, true);
        }

        private void createAccount(Object customer, boolean withChecking, boolean withSavings) {
            // do work
        }
    }

}
