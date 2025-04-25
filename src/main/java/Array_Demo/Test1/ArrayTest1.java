//Day03
package Array_Demo.Test1;
//需求: 已知数组元素为{33,5,22,44,55}
//找出数组中的最大值并打印在控制台
public class ArrayTest1 {
    public static void main(String[] orgs){
        int[] arr = {33,5,22,44,55};
        //定义变量max,记录最大值,max初始化值不能为0,因为数组中的数有可能是负数
        int max = arr[0];
        //循环比较大小,i初始值如果为0,自己和自己比较没有意义
        for(int i = 1;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最大值是" + max);
    }
}
