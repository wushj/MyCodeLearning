package dataStructure.sort;

public class InsertSort {

    public static void insertSort(int [] a){
        for (int i = 1; i < a.length ; i++) {
            int select = a[i];
            int j;
            for (j = i; j > 0; j--) {
                if (a[j - 1] > select){
                    a[j] = a[j - 1];
                }
                else{
                    break;
                }
            }
            a[j] = select;
        }

        //打印
        for(int i = 0;i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = {49,38,65,97,76,13,27};
        insertSort(a);
        System.out.println("--------------------------------");
    }

}
