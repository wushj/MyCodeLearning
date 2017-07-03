package refactor;

/**
 * Created by wu on 2017/7/3.
 * 有时候，父类的方法，随着业务的变化，只适合部分子类的时候，
 * 则需要将父类的方法下移到具体需要的子类中，这样才符合接口最小原则
 */
public class Day_4_PushDownMethod {

    /*---------------------------before--------------------------*/
    abstract class Animal {
        //狗吠
        public void Bark() {
            // code to bark
        }
    }

    class Dog extends Animal {
    }

    class Cat extends Animal {
    }

    /*---------------------------after---------------------------*/
    abstract class Animal1 {

    }

    class Dog1 extends Animal1 {

        //狗吠
        public void Bark() {
            // code to bark
        }
    }

    class Cat1 extends Animal1 {
    }
}
