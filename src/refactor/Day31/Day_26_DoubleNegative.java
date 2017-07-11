package refactor.Day31;

import java.util.Calendar;
import java.util.List;

/**
 * Created by WU on 2017/7/3.
 * 把代码中的双重否定语句修改成简单的肯定语句
 */
public class Day_26_DoubleNegative {

    static boolean isEmpty(String str) {
        if (null == str || str.length() == 0) {

            return true;
        }
        return false;
    }

    static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }


    public static void main(String[] args) {
    /*---------------------------before--------------------------*/
        if (!isEmpty("")) {
            //todo
        }
    /*---------------------------after---------------------------*/
        if (isNotEmpty("")) {
            //todo
        }
    }

}
