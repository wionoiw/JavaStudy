//Day03
package Array_Demo.Test3;
//需求: 定义一个数组,存入1,2,3,4,5,按照要求交换索引对应的元素
//交换前:1,2,3,4,5   交换后:5,4,3,2,1
public class ArrayTest3 {
    public static void main(String[] orgs){
        int[] arr ={1,2,3,4,5};
        //定义变量temp,用于临时存储数据,来交换位置
        int temp = arr[0];
        for(int i = 0;i < arr.length / 2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i ] = temp;
        }
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}


////https://www.bilibili.com/video/BV17F411T7Ao?t=461.5&p=60
//public class ArrayTest3 {
//    public static void main(String[] orgs){
//        int[] arr ={1,2,3,4,5};
//        //定义变量m记录较小的角标,定义变量n记录较大的角标
//        for(int m = 0,n = arr.length - 1;m < n;m++,n--){
//            //定义变量temp,用于临时存储数据,来交换位置
//            int temp = arr[m];
//            arr[m] = arr[n];
//            arr[n] = temp;
//        }
//        for(int i = 0;i < arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//}