//Day03
package Array_Demo.Test2;
//需求:生成10个1~100之间的随机数存入数组
//1)求出所有数据的和
//2)求所有数据的平均数
//3)统计有多少个数据比平均值小
import java.util.Random;

public class ArrayTest2 {
    public static void main(String[] orgs){
        //定义arr数组,用于存储数
        int[] arr = new int[10];
        Random random = new Random();
        //定义变量a作为所有数据之和
        double a = 0;
        for(int i = 0;i < arr.length;i++){
            //给数组赋值
            arr[i] = random.nextInt(100) + 1;
            //累加求和
            a += arr[i];
            //输出数组的每一项
            System.out.print(arr[i] + " ");
        }
        //定义变量b作为所有数据的平均数
        double b = a / arr.length ;
        //定义变量c记录有多少数据比平均值小
        int c = 0;
        //循环比大小
        for(int i = 0;i < arr.length;i++){
            if(arr[i] < b){
                c++;
            }
        }
        System.out.println("\n所有数据之和是" + a);
        System.out.println("所有数据的平均数是" + b);
        System.out.println("其中有" + c + "个数比平均值小");
    }
}
