package refactor;

import java.util.Date;

/**
 * Created by wu on 2017/7/3.
 * 指条件关系比较复杂时，代码的可读性会比较差，所以这时我们应当根据条件表达式
 * 是否需要参数将条件表达式提取成可读性更好的属性或者方法，如果条件表达式不需
 * 要参数则可以提取成属性，如果条件表达式需要参数则可以提取成方法。
 */
public class Day_16_EncapsulateConditional {
    
    /*---------------------------before--------------------------*/
    public class RemoteControl {
        private String[] Functions;
        private String Name;
        private int CreatedYear;

        public String PerformCoolFunction(String buttonPressed) {
            // Determine if we are controlling some extra function
            // that requires special conditions
            if (Functions.length > 1 && Name == "RCA" && CreatedYear > new Date().getYear() - 2) {
                return "doSomething";

            }
            return "";
        }
    }

    /*---------------------------after---------------------------*/
    public class RemoteControl2 {
        private String[] Functions;
        private String Name;
        private int CreatedYear;

        public String PerformCoolFunction(String buttonPressed) {
            // Determine if we are controlling some extra function
            // that requires special conditions
            if (HasExtraFunctions()) {
                return "doSomething";

            }
            return "";
        }

        private boolean HasExtraFunctions()
        {
            return Functions.length > 1 && Name == "RCA" && CreatedYear > new Date().getYear() - 2 ;
        }


    }
}
