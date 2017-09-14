package dataStructure.sort;

public class SelectionSort {

    public static void selectionSort(int [] a){
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i; j < a.length; j++) {
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }


        //打印
        for(int i = 0;i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = {49,38,65,97,76,13,27};
        selectionSort(a);
        System.out.println("--------------------------------");
    }
}
