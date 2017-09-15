package dataStructure.queue;

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

    public void insert(long value){
        end++;
        arr[end] = value;
        size++;
    }

    public long remove(){
        long value = arr[front];
        front++;
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
