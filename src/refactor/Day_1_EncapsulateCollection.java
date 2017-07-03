package refactor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wu on 2017/7/3.
 * 封装集合对象，不要暴露太多方法给外部访问内部数据
 */
public class Day_1_EncapsulateCollection {


    public static void main(String[] args) {

        Day1Test day1Test = new Day1Test();

        //获取到了内部对象
        List<String> list = day1Test.getList();

        //肆无忌惮的操作
        list.add("a");

        day1Test.iterator();

        //正确的做法
        Day1Test2 day1Test2 = new Day1Test2();

        //获取到了内部对象
        List<String> list2 = day1Test2.getList();

        //肆无忌惮的操作
        list2.add("a");

        day1Test2.iterator();
    }

    /*---------------------------before--------------------------*/

    static class Day1Test {

        private List<String> list = new ArrayList<String>();

        public List getList() {
            return list;
        }

        //模拟不暴露给外部
        protected void add(String value) {
            list.add(value);
        }

        protected void remove(String value) {
            list.remove(value);
        }

        public void iterator() {
            for (String str : list) {
                System.out.println(str);
            }
        }
    }

    /*---------------------------after---------------------------*/

    static class Day1Test2 {

        private List<String> list = new ArrayList<String>();

        public List getList() {
            return new ArrayList(list);
        }

        //模拟不暴露给外部
        protected void add(String value) {
            list.add(value);
        }

        protected void remove(String value) {
            list.remove(value);
        }

        public void iterator() {
            for (String str : list) {
                System.out.println(str);
            }
        }
    }

}
