package Algorithm_Demo.Search_Demo.BinarySearch_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/19 21:53
 * @Day Day23
 */

//BinarySearch  二分查找/折半查找

//前提条件:
    //数组中的数据必须是有序的
    //如果数据是乱的，先排序再用二分查找得到的索引没有实际意义，只能确定当前数字在数组中是否存在，因为排序之后数字的位置就可能发生变化了
//核心逻辑：每次排除一半的查找范围
//二分查找的过程
    //min和max表示当前要查找的范围
    //mid是在min和max中间的索引
    //如果要查找的元素在mid的左边，缩小范围时min不变，max等于mid减1
    //如果要查找的元素在mid的右边，缩小范围时max不变，min等于mid加1

public class BinarySearchDemo1 {
    public static void main(String[] args) {
        int[] arr ={7,23,79,81,103,127,131,147};
        System.out.println(binarySearch(arr,23));
    }

    //1，min和max表示当前要查找的范围
    //2，mid是在min和max中间的
    //3，如果要查找的元素在mid的左边,缩小范围时，min不变，max等于mid减1
    //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
    //数据如下：{7，23,79,81,103,127,131,147}
    public static int binarySearch(int[] arr,int num) {
        //声明最左侧索引
        int min = 0;
        //声明最右侧索引
        int max = arr.length-1;
        //min和max的中间位置
        int mid = 0;

        //利用循环不断查找要找的数据
        while(min < max){
            //min和max的中间位置
            mid = (min + max) / 2;

            //拿着mid指向的元素跟要查找的元素进行比较
            if(arr[mid] == num){
                return (min+max) / 2;
            } else if (arr[mid] < num) {
                //num在mid右边
                min = mid + 1;
            } else if (arr[mid] > num) {
                //num在mid左边
                max = mid - 1;
            }
        }

        return -1;
    }
}
