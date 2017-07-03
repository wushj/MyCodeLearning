package refactor;

/**
 * Created by wu on 2017/7/3.
 * 指超过一个的类要使用某一个类中部分方法时，我们应该解开它们之间的依赖，让调用者使用接口，这很容易实现也可以降低代码的耦合性。
 */
public class Day_9_ExtractInterface {

    /*---------------------------before--------------------------*/
    public class ClassRegistration{
        public double Total;

        public void create(){
        }

        public void transfer(){
        }

    }

    public class RegistrationProcessor{

        public double processRegistration(ClassRegistration registration)
        {
            registration.create();
            return registration.Total;
        }
    }


    /*---------------------------after---------------------------*/
    public interface IClassRegistration1{
        public double total = 0;
        public void create();
    }

    public class ClassRegistration1 implements IClassRegistration1{

        public double total;

        public void create(){
        }

        public void transfer(){
        }
    }

    public class RegistrationProcessor1{

        public double ProcessRegistration(IClassRegistration1 registration){
            registration.create();
            return registration.total;
        }
    }
}
