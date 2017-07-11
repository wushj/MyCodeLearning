package refactor.Day31;

/**
 * Created by wu on 2017/7/3.
 * 是指在根本没有父子关系的类中使用继承是不合理的，可以用委派的方式来代替。
 */
public class Day_8_ReplaceInheritance {
    
    /*---------------------------before--------------------------*/
    class Sanitation {
        public String WashHands() {
            return "Cleaned!";
        }
    }

    public class Child extends Sanitation {
    }


    /*---------------------------after---------------------------*/
    class Sanitation1 {
        public String WashHands() {
            return "Cleaned!";
        }
    }

    class Child1 {
        private Sanitation1 Sanitation;

        public Child1() {
            Sanitation = new Sanitation1();
        }

        public String WashHands() {
            return Sanitation.WashHands();
        }
    }
}
