package Algorithm_Demo.Sort_Demo.BubblingSort_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/20 14:14
 * @Day Day24
 */

//BubblingSort      冒泡排序
//冒泡排序:相邻的数据两两比较，小的放前面，大的放后面

//冒泡排序的步骤
//1.相邻的元素两两比较,大的放右边，小的放左边。
//2.第一轮比较完毕之后,最大值就已经确定，第二轮可以少循环一次，后面以此类推。
//3.如果数组中有n个数据,总共我们只要执行n-1轮的代码就可以
public class BubblingSortDemo1 {
    public static void main(String[] args) {
        //排序算法运行12500个数据运行时间
        int[] Arr = new int[12500];
        long start = System.currentTimeMillis();
        bubblingSort(Arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        //1.定义数组
        int[] arr={2,4,5,3,1,46,64,45,56,151,4,56,65};
        //2.利用冒泡排序将数组中的数据变成12345
        bubblingSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //利用冒泡排序将数组中的数据从小到大进行排序
    public static void bubblingSort(int[] arr) {
        int temp = arr[0];
        //外循环：表示我要执行多少轮。如果有n个数据，那么执行n－1 轮
        for (int j = 0; j < arr.length - 1; j++) {
            //内循环：每一轮中我如何比较数据并找到当前的最大值
            //-1：为了防止索引越界
            //-j：提高效率，每一轮执行的次数应该比上一轮少一次。
            for (int i = 0; i < arr.length - 1 -j; i++) {
                if(arr[i] > arr[i + 1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
