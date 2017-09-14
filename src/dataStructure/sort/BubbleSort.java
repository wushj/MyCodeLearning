package dataStructure.sort;

public class BubbleSort {

    /**
     * 冒泡排序的第一种实现, 没有任何优化
     */
    public static void bubbleSort1(int[] a){
        for (int i = 0; i < a.length; i++) {//表示n次排序过程。
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {//前面的数字大于后面的数字就交换
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        //打印
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * 设置一个标志，如果这一趟发生了交换，则为true，否则为false。明显如果有一趟没有发生交换，说明排序已经完成。
     * @param a
     */
    public static void bubbleSort2(int[] a) {
        int k = a.length - 1;
        boolean flag = true;//发生了交换就为true, 没发生就为false，第一次判断时必须标志位true。
        while (flag) {
            flag = false;//每次开始排序前，都设置flag为未排序过
            for (int j = 0; j < k; j++) {
                if (a[j] > a[j + 1]) {//前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    //表示交换过数据;
                    flag = true;
                }
            }
            k--;//减小一次排序的尾边界
        }//end while

        //打印
        for(int i = 0;i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void bubbleSort3(int [] a){
        int j, k;
        int flag = a.length - 1;//flag来记录最后交换的位置，也就是排序的尾边界

        while (flag > 0) {//排序未结束标志
            k = flag; //k 来记录遍历的尾边界
            flag = 0;

            for (j = 0; j < k; j++) {
                if (a[j] > a[j + 1]) {//前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    //表示交换过数据;
                    flag = j;//记录最新的尾边界.
                }
            }
        }

        //打印
        for(int i = 0;i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = {49,38,65,97,76,13,27,99,66,1};
//        bubbleSort1(a);
        System.out.println("--------------------------------");
        bubbleSort2(a);
        System.out.println("--------------------------------");
//        bubbleSort3(a);
    }

}
