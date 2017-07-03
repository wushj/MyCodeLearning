package refactor;

/**
 * Created by wu on 2017/7/3.
 * 如果子类都有相同的方法，那就应该将方法提上到父类层
 */
public class Day_3_PullUpMethod {

    /*---------------------------before--------------------------*/
    abstract class Vehicle {
        // other methods
    }

    class Car extends Vehicle {
        public void Turn(String str) {
            // code here
        }
    }

    public class Motorcycle extends Vehicle {
        public void Turn(String str) {
            // code here
        }
    }

    /*---------------------------after---------------------------*/
    abstract class Vehicle1 {
        public void Turn(String str) {
            // code here
        }
    }

    class Car1 extends Vehicle1 {

    }

    public class Motorcycle1 extends Vehicle1 {

    }

}
