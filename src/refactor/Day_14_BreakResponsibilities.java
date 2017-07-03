package refactor;

import java.util.List;

/**
 * Created by wu on 2017/7/3.
 * 当一个类有许多职责时，将部分职责分离到独立的类中，
 * 这样也符合面向对象的五大特征之一的单一职责原则，同时也可以使代码的结构更加清晰，维护性更高。
 */
public class Day_14_BreakResponsibilities {
    /*---------------------------before--------------------------*/
    // 上面的问题，其实一直提到设计原则，自然也提到了单一责任原则SRP，
    // 要学重构，SRP是必然要知道，且学会的思想，并且灵活应用到重构代码中。
    // 下面作者举了一个Video的例子，Video类中有两个方法，
    // 分别负责统计客户购买的Video数量，并且计算每个客户的购买金额

    public class Video{
        public void payFee(int fee){
        }

        public void rentVideo(Video video, Customer customer){
            customer.videos.add(video);
        }

        public int calculateBalance(Customer customer){
            return customer.lateFees.size();
        }
    }

    public class Customer{
        public List<Integer> lateFees;
        public List<Video> videos;
    }

    /*---------------------------after---------------------------*/
    // 很明显，顾客购买Video的金额，并不是Video本身应该关系的，
    // 而是每个Customer应该关系的，因此，需要将计算购买金额的方法下移到Customer类中来完成
    public class Video1{
        public void rentVideo(Video1 video, Customer1 customer){
            customer.Videos.add(video);
        }
    }

    public class Customer1{
        public List<Integer> LateFees;
        public List<Video1> Videos ;

        public void payFee(int fee){
        }

        public int calculateBalance(Customer1 customer){
            return customer.LateFees.size();
        }
    }

}
