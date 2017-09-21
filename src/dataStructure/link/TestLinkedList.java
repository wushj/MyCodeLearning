package dataStructure.link;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertHead(10);
        list.insertHead(22);
        list.insertHead(345);
        list.insertHead(455);
        list.insertHead(579);

        list.displayAll();

        System.out.println("查找到的数据为:" +list.find(345).getData());

        System.out.println("----------------------------------------------");

        LinkedList list2 = new LinkedList();
        list2.insertTail(10);
        list2.insertTail(22);
        list2.insertTail(345);
        list2.insertTail(455);
        list2.insertTail(579);

        list2.insert(123,1);

        list2.displayAll();
    }

}
