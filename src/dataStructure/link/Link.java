package dataStructure.link;

/**
 * @Description: 链接点
 * @author: wusj
 * @Date:   2017/9/19 17:26
 */
public class Link {

    private long data;

    private Link next;

    public Link(long data){
        this.data = data;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }
}
