package refactor;

/**
 * Created by WU on 2017/7/3.
 * 如果一个方法带有大量的bool 参数时，可以根据bool 参数的数量，提取出若干个独立的方法来简化参数。
 */
public class Day_29_RemoveMiddleMan {


    /*---------------------------before--------------------------*/
    // 如何理解去除中间人呢？简单理解，就是当A需要通过B去访问C的时候，
    // 并且B除了调用C的方法，不在有任何作用的时候，则B就成了所谓的中间人，就应该被delete掉
    public class Consumer {
        public AccountManager accountManager;

        public Consumer(AccountManager accountManager) {
            this.accountManager = accountManager;
        }

        public void Get(int id) {
            Account account = accountManager.getAccount(id);
        }
    }

    public class AccountManager {
        public AccountDataProvider dataProvider;

        public AccountManager(AccountDataProvider dataProvider) {
            this.dataProvider = dataProvider;
        }

        public Account getAccount(int id) {
            return dataProvider.getAccount(id);
        }
    }

    public class AccountDataProvider {
        public Account getAccount(int id) {
            // get account
            return null;
        }
    }

    class Account {


    }

    /*---------------------------after---------------------------*/
    public class Consumer2
    {
        public AccountDataProvider accountDataProvider;

        public Consumer2(AccountDataProvider dataProvider)
        {
            accountDataProvider = dataProvider;
        }

        public void Get(int id)
        {
            Account account = accountDataProvider.getAccount(id);
        }
    }

}
