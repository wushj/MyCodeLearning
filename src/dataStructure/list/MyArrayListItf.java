package dataStructure.list;

/**
 * Created by wu on 2017/7/3.
 */
public interface MyArrayListItf<E> {
    /**
     * 取得数据
     */
    E get(int index);

    /**
     * 新增数据
     */
    void add(E e);

    /**
     * 移除数据
     */
    void remove(int index);

    /**
     * 插入数据
     */
    void insert(int index,E e);

    /**
     * 是否存在数据
     * @return
     */
    boolean contains(Object o);

    /**
     * 获得List长度
     * @return
     */
    int size();

    /**
     * 是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 清空
     */
    void clearList();
}
