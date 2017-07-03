package dataStructure.list;

/**
 * Created by wu on 2017/7/3.
 */
public class MyArrayList<E> implements MyArrayListItf<E> {
    /**
     * 数组默认长度
     */
    private static final int DEFAULT_SIZE = 10;

    /**
     * 存储队列中的元素
     */
    private Object[] elements = null;

    /**
     *数组大小指针
     */
    private int size;

    /**
     * 当前游标
     */
    private int current;

    public MyArrayList(){
        this(DEFAULT_SIZE);
    }

    public MyArrayList(int size){
        if(size < 0){
            throw new RuntimeException("数组大小不能小于0");
        }
        elements = new Object[size];
        this.current = 0;
        this.size = size;
    }

    @Override
    public E get(int index) {
        validateIndex(index);
        return (E) this.elements[index];
    }

    @Override
    public void add(E e) {
        resize();
        elements[current] = e;
        current++;
    }

    @Override
    public void remove(int index) {
        validateIndex(index);
        for (int i = index; i < current; i++) {
            elements[i] = elements[i + 1];
        }
        current--;
    }

    @Override
    public void insert(int index, E e) {
        validateIndex(index);
        resize();
        for (int i = current; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = e;
        current++;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if(o.equals(elements[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return current;
    }

    @Override
    public boolean isEmpty() {
        if (current > 0) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void clearList() {
        elements = new Object[DEFAULT_SIZE];
    }

    private void validateIndex(int index) {
        if (index > size || index < 0){
            throw new RuntimeException("超过范围!");
        }
    }

    private void resize() {
        if (current == size){
            size = size + DEFAULT_SIZE;
            Object[] newElements = new Object[size];
            for(int i = 0;i < elements.length; i++){
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }
}
