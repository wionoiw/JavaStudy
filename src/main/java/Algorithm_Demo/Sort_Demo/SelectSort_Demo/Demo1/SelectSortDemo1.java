package Algorithm_Demo.Sort_Demo.SelectSort_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/20 14:48
 * @Day Day24
 */

//选择排序          //Select sort
//选择排序:从0索引开始，拿着每一个索引上的元素跟后面的元素依次比较,小的放前面,大的放后面,以此类推。

//选择排序过程
//1，从0索引开始，跟后面的元素一一比较。
//2，小的放前面，大的放后面。
//3，第一次循环结束后，最小的数据已经确定。
//4，第二次循环从1索引开始以此类推。
public class SelectSortDemo1 {
    public static void main(String[] args) {
        //排序算法运行12500个数据运行时间
        int[] Arr = new int[12500];
        long start = System.currentTimeMillis();
        selectSort(Arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        //1.定义数组
        int[] arr={2,4,5,3,1,46,64,45,56,151,4,56,65};
        //2.利用选择排序将数组中的数据变成12345
        selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //利用选择排序将数组中的数据从小到大进行排序
    public static void selectSort(int[] arr) {
        int temp = arr[0];
        //外循环:假如有n个数据,则只用外循环n-1次
        //i：表示这一轮中，我拿着哪个索引上的数据跟后面的数据进行比较并交换
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环：每一轮我要干什么事情？
            //拿着i跟i后面的数据进行比较交换
            for (int j = i + 1; j < arr.length ; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }
}
