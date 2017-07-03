package refactor.Day31;

import java.util.List;

/**
 * Created by WU on 2017/7/3.
 * 把代码中的双重否定语句修改成简单的肯定语句
 */
public class Day_27_RemoveGodClasses {


    /*---------------------------before--------------------------*/
    public class CustomerService {
        public int CalculateOrderDiscount(String str) {
            // do work
            return 0;
        }

        public boolean CustomerIsValid(String str) {
            // do work
            return true;
        }

        public List<String> GatherOrderErrors() {
            // do work
            return null;
        }

        public void Register(Object customer) {
            // do work
        }

        public void ForgotPassword(Object customer) {
            // do work
        }
    }
    /*---------------------------after---------------------------*/
    public class CustomerService2 {
        public int CalculateOrderDiscount(String str) {
            // do work
            return 0;
        }

        public boolean CustomerIsValid(String str) {
            // do work
            return true;
        }

        public List<String> GatherOrderErrors() {
            // do work
            return null;
        }
    }

    public class  CustomerRegistrationService{
        public void Register(Object customer) {
            // do work
        }
        public void ForgotPassword(Object customer) {
            // do work
        }
    }

}
