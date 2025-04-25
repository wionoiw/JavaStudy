//Day10
package class_Demo.Test3;

import java.util.StringJoiner;

public class ArrayUtil{
    //私有化空参构造,防止创建ArrayUtil对象
    private ArrayUtil(){
    }

    //用于打印整数数组
    public static void printArr(int[] arr){
        StringJoiner sj = new StringJoiner(",","[","]");
        for(int i = 0;i < arr.length;i++){
            sj.add(arr[i] + "");
        }
        System.out.println(sj.toString());
    }

    //用于返回浮点数数组平均分
    public static double getAverage(double[] arr){
        double temp = 0;
        int size = arr.length;
        for(int i = 0;i < size;i++){
            temp += arr[i];
        }
        return temp/size;
    }
}
