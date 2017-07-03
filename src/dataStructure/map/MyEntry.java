package dataStructure.map;

/**
 * Created by wu on 2017/7/3.
 */
public class MyEntry<K , V> {

    private K key;

    private V value;

    private MyEntry<K,V> next;

    public MyEntry() {
        super();
    }

    public MyEntry(K key, V value) {
        super();
        this.key = key;
        this.value = value;
    }



    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public MyEntry<K, V> getNext() {
        return next;
    }

    public void setNext(MyEntry<K, V> next) {
        this.next = next;
    }
}
