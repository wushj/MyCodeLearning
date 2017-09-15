package dataStructure.stack;

public class Mystack {

    private int maxSize;

    private long[] arr;

    private int top;

    public Mystack(int size){
        maxSize = size;
        arr = new long[maxSize];
        top = -1;
    }

    /**
     * 压入栈
     * @param value
     */
    public void push(long value){
        top++;
        arr[top] = value;
    }

    /**
     * 弹出栈
     * @return
     */
    public long pop(){
        long value = arr[top];
        top--;
        return value;
    }

    /**
     * 获取最上层
     * @return
     */
    public long peek(){
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize;
    }

    public static void main(String[] args) {
        Mystack mystack = new Mystack(10);

        mystack.push(111);
        mystack.push(222);
        mystack.push(333);
        mystack.push(444);
        mystack.push(555);
        mystack.push(666);

        while (!mystack.isEmpty()){
            System.out.println(mystack.pop());
        }

    }
}
