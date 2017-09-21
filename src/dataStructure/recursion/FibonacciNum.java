package dataStructure.recursion;

/**
 * fibonacci数列
 */
public class FibonacciNum {

    public static int fibonacciNum(int i){
        if (i == 1 || i == 2){
            return i;
        }
        return fibonacciNum(i-1) + fibonacciNum(i-2);
    }


    public static void main(String[] args) {
        System.out.println(fibonacciNum(1));
        System.out.println(fibonacciNum(2));
        System.out.println(fibonacciNum(3));
        System.out.println(fibonacciNum(4));
    }
}
