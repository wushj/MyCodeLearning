package dataStructure.map;

/**
 * Created by wu on 2017/7/3.
 */
public class MyMapTest {

    public static void main(String[] args) {

        MyMap<Integer,String> map = new MyMap<Integer,String>();
        map.put(1,"aaa");
        map.put(2,"bbb");

        System.out.println(map.get(2));
        System.out.println(map.size());

        System.out.println("-------------------------------------");

        map.put(2,"ccc");
        map.put(3,"xxx");

        System.out.println(map.get(2));
        System.out.println(map.size());

        map.put(4,"xxx");
        map.put(5,"xxx");
        map.put(6,"xxx");
        map.put(7,"xxx");
        map.put(8,"xxx");
        map.put(9,"xxx");
        map.put(10,"xxx");
        map.put(11,"xxx");
        map.put(12,"xxx");

        System.out.println("-------------------------------------");
        System.out.println(map.size());

    }

}
