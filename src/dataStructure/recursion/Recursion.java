package dataStructure.recursion;

/**
 * 递归顺序
 */
public class Recursion {

    public static void recursion(int n){
        n--;
        if(n > 0){
            System.out.println("helloWorld" + n);
            recursion(n);
            System.out.println("java" + n);
        }
    }

    public static void main(String[] args) {
        recursion(100);
    }
}
