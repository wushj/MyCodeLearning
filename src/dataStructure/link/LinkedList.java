package dataStructure.link;

/**
 * 链表
 */
public class LinkedList {

    private Link first;

    /**
     * 新增头节点
     * @param value
     */
    public void insertHead(long value){
        Link link = new Link(value);
        if(first == null){
            first = link;
        }else{
            link.setNext(first);
            first = link;
        }
    }

    /**
     * 新增尾节点
     * @param value
     */
    public void insertTail(long value){
        Link link = new Link(value);

        if (first == null){
            first = link;
            return;
        }
        Link cur = first;
        while (cur.getNext() != null){
            cur = cur.getNext();
        }
        cur.setNext(link);
    }

    /**
     * 插入节点到指定位置
     * @param value
     * @param index
     */
    public void insert(long value,int index){
        Link current = first;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        Link link = new Link(value);
        link.setNext(current.getNext());
        current.setNext(link);
    }

    /**
     * 打印
     */
    public void displayAll(){
        Link current = first;
        while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    /**
     * 查找key
     * @param key
     * @return
     */
    public Link find(long key){
        Link current = first;
        while(current != null){
            if(current.getData() == key){
                return current;
            }else{
                current = current.getNext();
            }
        }
        return null;
    }

    /**
     * 删除key
     * @param key
     * @return
     */
    public void delete(long key){
        Link current = first;
        Link ago = first;
        while(current.getData() != key){
            if(current.getNext() == null){
                return;
            }else{
                ago = current;
                current = current.getNext();
            }
        }

        if(current == first){
            first = first.getNext();
        }else{
            ago.setNext(current.getNext());
        }
    }

}
