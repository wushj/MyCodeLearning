package refactor.Day31;

/**
 * Created by wu on 2017/7/3.
 * 如果子类的属性和方法也适合于基类，那么就可以移除子类，从而减少依赖关系。
 */
public class Day_21_CollapseHierarchy {
    
    /*---------------------------before--------------------------*/
    public abstract class Website{
        public abstract String Title();
    }

    public abstract  class StudentWebsite extends Website{
        public abstract boolean IsActive() ;
    }

    /*---------------------------after---------------------------*/
    public abstract class Website2{
        public abstract String Title();
        public abstract boolean IsActive() ;
    }

    public abstract  class StudentWebsite2 extends Website{

    }
}
