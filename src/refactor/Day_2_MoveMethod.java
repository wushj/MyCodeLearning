package refactor;

/**
 * Created by wu on 2017/7/3.
 * 将方法移动到更合适的类中
 */
public class Day_2_MoveMethod {

    /*---------------------------before--------------------------*/
    class BankAccount {
        public BankAccount(int accountAge, int creditScore, AccountInterest accountInterest) {
            AccountAge = accountAge;
            CreditScore = creditScore;
            AccountInterest = accountInterest;
        }

        public int AccountAge;
        public int CreditScore;
        public AccountInterest AccountInterest;

        //这个方法跟BankAccount没有直接关系
        public double CalculateInterestRate() {
            if (CreditScore > 800)
                return 0.02;

            if (AccountAge > 10)
                return 0.03;

            return 0.05;
        }
    }

    /*---------------------------after---------------------------*/
    class AccountInterest {
        public BankAccount Account;

        public AccountInterest(BankAccount account) {
            Account = account;
        }

        public double InterestRate() {
            return Account.CalculateInterestRate();
        }

        public boolean IntroductoryRate() {
            {
                return Account.CalculateInterestRate() < 0.05;
            }
        }
    }


    class BankAccount1 {
        public BankAccount1(int accountAge, int creditScore, AccountInterest1 accountInterest) {
            AccountAge = accountAge;
            CreditScore = creditScore;
            AccountInterest1 = accountInterest;
        }

        public int AccountAge;
        public int CreditScore;
        public AccountInterest1 AccountInterest1;
    }

    class AccountInterest1 {
        public BankAccount1 Account;

        public AccountInterest1(BankAccount1 account) {
            Account = account;
        }

        public double InterestRate() {
            return CalculateInterestRate();
        }

        public boolean IntroductoryRate() {
            return CalculateInterestRate() < 0.05;
        }

        public double CalculateInterestRate() {
            if (Account.CreditScore > 800)
                return 0.02;

            if (Account.AccountAge > 10)
                return 0.03;

            return 0.05;
        }
    }

}
