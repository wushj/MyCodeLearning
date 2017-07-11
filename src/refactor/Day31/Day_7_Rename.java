package refactor.Day31;

/**
 * Created by wu on 2017/7/3.
 * 指在写代码的时候对类、方法、参数、委托、事件等等元素取一个有意义的名称
 */
public class Day_7_Rename {

    /*---------------------------before--------------------------*/
    public class Person
    {
        public String FN;

        public double ClcHrlyPR()
        {
            // code to calculate hourly payrate
            return 0d;
        }
    }

    /*---------------------------after---------------------------*/
    // Changed the class name to Employee
    public class Employee
    {
        public String FirstName;

        public double CalculateHourlyPay()
        {
            // code to calculate hourly payrate
            return 0d;
        }
    }
}
