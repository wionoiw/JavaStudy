package Algorithm_Demo.Sort_Demo.InsertSort_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/20 15:08
 * @Day Day24
 */

//插入排序          //Insert sort
//插入排序:将0索引的元素到N索引的元素看做是有序的,把N+1索引I的元素到最后一个当成是无序的
//遍历无序的数据,将遍历到的元素插入有序序列中适当的位置,如遇到相同数据,插在后面。
//N的范围：0~最大索引    
public class InsertSortDemo1 {
    public static void main(String[] args) {
        //排序算法运行12500个数据运行时间
        int[] Arr = new int[12500];
        long start = System.currentTimeMillis();
        insertSort1(Arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        //1.定义数组
        int[] arr={0,3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        //2.利用插入排序将数组中的数据变成12345
        insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //利用插入排序将数组中的数据从小到大进行排序
    public static void insertSort(int[] arr) {
        int temp;

        //找到无序的数据是从哪个索引开始的
        int startIndex = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]){
                startIndex = i+1;
                break;
            }
        }

        //当startIndex为-1时,说明该数组已经是按照从小到大的顺序排列的了
        if (startIndex == -1) {
            return;
        }

        //遍历从startIndex开始到最后依次得到无序的数据中的每一个元素
        for (int i = startIndex; i < arr.length; i++) {

            //记录当前要插入数据的索引
            int j = i;
            //当插入的数索引为零,或大于前一个数时结束循环
            while (j > 0 && arr[j] < arr[j - 1]){
                //交换位置
                temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }

//            for (int j = i ; j > 0; j--) {
//                //当插入的数小于前一个数时交换位置
//                if (arr[j] < arr[j - 1]) {
//                    temp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
//                //当插入的数大于前一个数时跳出循环
//                }else {
//                    break;
//                }
//            }

        }
    }

    //利用插入排序将数组中的数据从小到大进行排序
    public static void insertSort1(int[] arr) {
        int temp;

        //遍历从startIndex开始到最后依次得到无序的数据中的每一个元素
        for (int i = 1; i < arr.length; i++) {

            //记录当前要插入数据的索引
            int j = i;
            //当插入的数索引为零,或大于前一个数时结束循环
            while (j > 0 && arr[j] < arr[j - 1]){
                //交换位置
                temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }

        }
    }
}
