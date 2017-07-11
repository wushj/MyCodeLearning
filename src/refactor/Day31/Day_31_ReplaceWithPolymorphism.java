package refactor.Day31;

/**
 * Created by WU on 2017/7/3.
 * 如果你需要检查对象的类型或者根据类型执行一些操作时，一种很好的办法就是将算法封装到类中，并利用多态性进行抽象调用。
 */
public class Day_31_ReplaceWithPolymorphism {

    public static void main(String[] args) {
        Day_31_ReplaceWithPolymorphism day_31 = new Day_31_ReplaceWithPolymorphism();

        Parent parent = new Parent();
        Son son = new Son();
        Daughter daughter = new Daughter();
        /*---------------------------before--------------------------*/
        day_31.invokeSay(parent);
        day_31.invokeSay(son);
        day_31.invokeSay(daughter);
        /*---------------------------after---------------------------*/
        System.out.println("华丽的分割线");
        //使用动态方式
        day_31.invokeSay2(parent);
        day_31.invokeSay2(son);
        day_31.invokeSay2(daughter);
        //考虑重载解决 -->又涉及到单分派-->通过使用访问者模式来解决

    }


    public void invokeSay(Object parent) {
        if (parent instanceof Son) {
            ((Son) parent).say();
        } else if (parent instanceof Daughter) {
            ((Daughter) parent).say();
        } else {
            ((Parent) parent).say();
        }
    }

    public void invokeSay2(Parent parent) {
        parent.say();
    }

    static class Parent {

        public void say() {
            System.out.println("Parent say");
        }

    }

    static class Son extends Parent {

        public void say() {
            System.out.println("Son say");
        }
    }

    static class Daughter extends Parent {

        public void say() {
            System.out.println("Daughter say");
        }
    }


}
