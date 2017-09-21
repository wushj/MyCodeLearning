package dataStructure.recursion;

/**
 * 三角数列
 */
public class TriangleNum {

    public static int testNum(int n){
        int result = 0;
        for (int i = n; i > 0; i--) {
            result = result + i;
        }
        return result;
    }

    public static int recursionNum(int n){
        if (n == 1){
            return 1;
        }
        return n + recursionNum(--n);
    }

    public static void main(String[] args) {
        System.out.println(testNum(1));
        System.out.println(testNum(2));
        System.out.println(testNum(3));
        System.out.println(testNum(4));

        System.out.println(recursionNum(1));
        System.out.println(recursionNum(2));
        System.out.println(recursionNum(3));
        System.out.println(recursionNum(4));
    }



}
