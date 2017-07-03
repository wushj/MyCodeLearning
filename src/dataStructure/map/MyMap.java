package dataStructure.map;

/**
 * Created by wu on 2017/7/3.
 */
public class MyMap<K,V> implements MyMapItf<K,V> {

    private int DEFAULT_SIZE = 10;

    private int size = 0;

    private int current = 0;

    private MyEntry<K,V>[] entries;

    public MyMap() {
        entries = new MyEntry[DEFAULT_SIZE];
        size = DEFAULT_SIZE;
    }

    public int size(){
        return current;
    }

    @Override
    public void put(K key, V value) {
        // 要添加到的链表的下表
        // 链表当前存储的第一个元素
        MyEntry<K,V> privious = entries[current];

        // 有相同的key就覆盖
        for (MyEntry<K,V> entry = entries[current]; entry != null; entry = entry.getNext()) {
            if (entry.getKey().equals(key)) {
                // 替换value
                entry.setValue(value);
                return;
            }
        }

        // 没有相同的key就添加,并且把这个键值对放在头部
        current++;
        resize();
        MyEntry entry = new MyEntry(key, value);
        entry.setNext(privious);
        entries[current] = entry;

        return;
    }

    private void resize() {
        if(current == size){
            size = size + DEFAULT_SIZE;
            MyEntry<K,V>[] newEntries = new MyEntry[size];
            for (int i = 0; i < entries.length; i++) {
                newEntries[i] = entries[i];
            }
            entries = newEntries;
        }
    }

    @Override
    public V get(K key) {
        for (MyEntry<K,V> entry = entries[current]; entry != null; entry = entry.getNext()) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }


}
