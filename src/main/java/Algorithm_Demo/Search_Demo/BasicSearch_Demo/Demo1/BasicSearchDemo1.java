package Algorithm_Demo.Search_Demo.BasicSearch_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/19 21:20
 * @Day Day23
 */

//基本/顺序查找      //Basic lookup

//核心:
//从0索引开始挨个往后查找
//需求：定义一个方法利用基本查找，查询某个元素是否存在
//数据如下：{131，127，147，81，103，23，7，79}
public class BasicSearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {131,127,147,81,103,23,7,79};
        System.out.println(basicSearch(arr,81));

    }

    //参数:
    //一:数组
    //二:要查找的元素
    //返回值:元素是否存在
    public static boolean basicSearch(int[] arr,int number) {
        //利用基本查找来查找number在数组中是否存在
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

}
