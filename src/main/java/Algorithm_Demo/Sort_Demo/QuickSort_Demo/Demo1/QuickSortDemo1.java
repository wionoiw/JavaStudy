package Algorithm_Demo.Sort_Demo.QuickSort_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/20 16:14
 * @Day Day24
 */

//快速排序          //Quick sort

//第一轮:以0索引的数字为基准数，确定基准数在数组中正确的位置。
//比基准数小的全部在左边，比基准数大的全部在右边。
//后面以此类推。
public class QuickSortDemo1 {
    public static void main(String[] args) {
        //排序算法运行12500个数据运行时间
        int[] Arr = new int[12500];
        long start = System.currentTimeMillis();
        quickSort(Arr,0,Arr.length-1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        //1.定义数组
        int[] arr={0,100,3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};

        //2.利用快速排序将数组中的数据变成12345
        quickSort(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }

    //利用快速排序将数组中的数据从小到大进行排序
    //传入参数要排序的数组,起始索引,结束索引
    public static void quickSort(int[] arr,int i,int j) {
        //设置递归调用的出口
        if (i >= j) {
            return;
        }

        //当数组为空时,直接返回
        if(arr.length == 0){
            return;
        }

        //左侧索引(从首部查找大于基准数的数)
        int start = i;
        //右侧索引(从尾部查找小于基准数的数)
        int end = j;
//        //记录基准数(最左侧数据)
//        int baseNumber = arr[i];
        //临时数据,用于数组元素交换位置
        int temp;

        //利用循环找到要交换的数字
        //等两个指针指向同一个数据时,该位置就是基准要存放的位置(基准归位)
        while(start != end){
            //利用end,从后往前开始找,找比基准数小的数字
            while (true){
                if(start >= end || arr[end] < arr[i]){
                    break;
                }
                end--;
            }

            //利用start,从前往后开始找,找比基准数大的数字
            while (true){
                if(start >= end || arr[start] > arr[i]){
                    break;
                }
                start++;
            }

            //将两指针指向的数据进行交换
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //基准数归位
        temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;

        //将基准数左边的范围进行排序
        quickSort(arr,i, start);
        //将基准数右边的范围进行排序
        quickSort(arr,start + 1,j);
    }
}
