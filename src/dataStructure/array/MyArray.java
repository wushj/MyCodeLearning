package dataStructure.array;

public class MyArray {

    private long arr[];

    private int size = 0;

    public MyArray(){
        arr = new long[50];
    }

    public MyArray(int size){
        arr = new long[size];
    }

    /**
     * 增加
     * @param value
     */
    public void insert(long value){
        arr[size] = value;
        size++;
    }

    /**
     * 删除
     * @param value
     */
    public void delete(long value){
        if (find(value) == -1){
            System.out.println("查找不到该数据!");
            return;
        }
        for (int i = find(value); i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    /**
     * 查找
     * @param value
     */
    public int find(long value){
        for (int i = 0; i < size; i++) {
            if (value == arr[i]){
                return i;
            }
        }
        return -1;
    }

    /**
     * 修改
     * @param oldValue
     * @param newValue
     */
    public void change(long oldValue,long newValue){
        int pos = find(oldValue);
        arr[pos] = newValue;
    }

    /**
     * 显示
     */
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 获取size
     * @return
     */
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        MyArray array = new MyArray();

        array.insert(111);
        array.insert(222);
        array.insert(333);
        array.insert(444);
        array.insert(5555);

        array.display();
        System.out.println("--------------------------------");

        System.out.println("位置为 " + array.find(333));
        System.out.println("--------------------------------");

        array.delete(444);
        array.display();
        System.out.println("--------------------------------");

        array.change(222,2222);
        array.display();
    }
}
