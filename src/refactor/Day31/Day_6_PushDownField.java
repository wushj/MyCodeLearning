package refactor.Day31;

/**
 * Created by wu on 2017/7/3.
 * 将父类的属性下移到具体需要的子类中
 */
public class Day_6_PushDownField {

     /*---------------------------before--------------------------*/
     abstract class Task {
         protected String _resolution;
     }

     public class BugTask extends Task {
     }

     public class FeatureTask extends Task {
     }

     /*---------------------------after---------------------------*/
     abstract class Task1 {

     }

     class BugTask1 extends Task1 {
        protected String _resolution;
     }

     class FeatureTask1 extends Task1 {
     }

}
