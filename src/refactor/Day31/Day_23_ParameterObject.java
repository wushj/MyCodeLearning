package refactor.Day31;

import java.util.List;

/**
 * Created by wu on 2017/7/3.
 * 指当一个方法的参数过多或者过为复杂时，可以考虑把这些参数封装成一个单独的类。
 * 如果一个方法所需要的参数大于5个，理解该方法的签名就变得比较困难，
 * 因为这样感觉参数很长、样式不好并且没有分类，所以我们有必要把参数进行封装。
 */
public class Day_23_ParameterObject {

    /*---------------------------before--------------------------*/
    public void test(boolean check, String str, int order) {
        //todo
    }

    /*---------------------------after---------------------------*/
    public void test(Argument argument) {
        //todo
    }

    class Argument {
        boolean check;
        String str;
        int order;

    }
}
