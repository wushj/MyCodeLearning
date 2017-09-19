package dataStructure.queue;

/**
 * @Description: 队列
 * @author: wusj
 * @Date:   2017/9/19 17:27
 */
public class MyQueue {

    private int maxSize;

    private int size;

    private int front;

    private int end;

    private long[] arr;

    public MyQueue(int maxSize){
        this.maxSize = maxSize;
        arr = new long[maxSize];
        size = 0;
        front = 0;
        end = -1;
    }

    /**
     * 循环插入
     * @param value
     */
    public void insert(long value){
        //如果end移到最尾则返回头部
        if(end == maxSize){
            end = -1;
        }
        end++;
        arr[end] = value;
        size++;
    }

    /**
     * 循环删除
     * @return
     */
    public long remove(){
        long value = arr[front];
        front++;

        //如果front移到最大 循环放到最开始
        if(front == maxSize){
            front = 0;
        }

        size--;
        return value;
    }

    public boolean isNull(){
        return size == 0;
    }

    public boolean isFull(){
        return end == (maxSize - 1);
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);
        myQueue.insert(111);
        myQueue.insert(222);
        myQueue.insert(333);
        myQueue.insert(444);
        myQueue.insert(555);

        System.out.println(myQueue.isFull());
        System.out.println(myQueue.isNull());

        while (!myQueue.isNull()){
            System.out.println(myQueue.remove());
        }
    }
}
