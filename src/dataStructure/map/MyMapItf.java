package dataStructure.map;

/**
 * Created by wu on 2017/7/3.
 */
public interface MyMapItf<K,V> {

    public void put(K key, V value);

    // 根据key取值
    public V get(K key);

}
