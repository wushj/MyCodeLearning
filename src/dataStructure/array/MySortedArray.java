package dataStructure.array;

public class MySortedArray {

    private long arr[];

    private int size = 0;

    public MySortedArray(){
        arr = new long[50];
    }

    public MySortedArray(int size){
        arr = new long[size];
    }

    /**
     * 有序增加
     * @param value
     */
    public int insert(long value){
        //1.查询插入元素比已有元素大的位置,元素的位置为该位置+1 初始为0
        int pos = 0;
        for (int i = 0; i < size; i++) {
            if (value > arr[i]){
                pos = i + 1;
            }
        }
        //2.将该位置后的元素全部后移一位
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i-1];
        }
        //3.将该位置设置值
        arr[pos] = value;
        //4.增加size
        size++;
        return pos;
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
     * 二分查找
     * @param value
     * @return
     */
    public int binaryFind(long value){
        int min = 0;
        int max = size;

        while(true){
            //5.如果下界超过上届则查找不到该元素
            if (min > max){
                return -1;
            }
            //1.获取元素位置为 上界+下界 / 2
            int pos = (min + max) /2;
            //2.如果刚好查找到则直接返回
            if (arr[pos] == value){
                return pos;
            }else if (arr[pos] < value){
                //3.如果二分目标小于值 则下界 = 二分位置 + 1
                min = pos + 1;
            }else if(arr[pos] > value){
                //4.如果二分目标大于值 则上界 = 二分位置 - 1
                max = pos - 1;
            }
        }
    }

    /**
     * 修改
     * @param oldValue
     * @param newValue
     */
    public void change(long oldValue,long newValue){
        int pos = find(oldValue);
        if (pos == -1){
            System.out.println("查找不到该数据!");
            return;
        }
        delete(oldValue);
        insert(newValue);
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
        MySortedArray array = new MySortedArray();

        array.insert(222);
        array.insert(333);
        array.insert(111);
        array.insert(44);
        array.insert(5555);

        array.display();

        System.out.println("--------------------------------");

        System.out.println("位置为 " + array.find(333));

        System.out.println("--------------------------------");

        array.delete(44);
        array.display();

        System.out.println("--------------------------------");

        array.change(222,2222);
        array.display();
        System.out.println("--------------------------------");

        System.out.println("位置为 " + array.binaryFind(111));

    }
}
