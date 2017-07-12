package basic;

/**
 * Created by wu on 2017/7/12.
 */
public class GetClass {

    public static void main(String[] args) {
        C c = new C();
        c.test();
    }

}

class A {
    public void test(){
        System.out.println(this.getClass());
        System.out.println(this.getClass().getSimpleName());
        System.out.println(this.getClass().getName());
        System.out.println(this.getClass().getSuperclass());
        System.out.println(this.getClass().getSuperclass().getSimpleName());
        System.out.println(this.getClass().getSuperclass().getName());
    }
}

class B extends A {
    B(){
        System.out.println("B.init.....");
    }
}
 class C extends B{
    C(){
        System.out.println("C.init..........");
    }
}