package dataStructure.list;

/**
 * Created by wu on 2017/7/3.
 */
public class MyListTest {
    public static void main(String[] args) {
        MyArrayListItf list = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------------------------------------");
        list.insert(5,888);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-------------------------------------------");
        System.out.println(list.contains(888));

        System.out.println("-------------------------------------------");
        list.remove(5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
