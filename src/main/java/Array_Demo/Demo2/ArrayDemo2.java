//Day03
package Array_Demo.Demo2;

//数组动态初始化 : 初始化时仅指定数组长度,由系统为数组分配初始值
//数据类型[] 数组名 = new 数据类型(数组长度);
//例:   int[] arr = new int(100);


//数组默认初始化值的规律
//整数类型默认初始化值为0
//小数类型默认初始化值为0.0
//字符类型默认初始化值为'/u0000'(空格)
//bool类型默认初始化值为false
//引用数据类型默认初始化值为null


//length 获取数组长度
//数组名.length
//例: int i = arr.length;


//需求:键盘录入正整数num,定义数组存储1~num,
// 数组遍历,统计其中同时能被3和5整除的数
import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] orgs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        //定义变量num接收键盘输入的正整数
        int num = scanner.nextInt();
        //初始化数组,用于存储1~num,在[]输入num,设定数组长度
        int[] arr = new int[num];
        //定义变量b,统计符合条件的数
        int b = 0;
        //循环依次为数组赋值
        for(int i = 0;i < num;i++){
            arr[i] = i + 1;
        }
        //遍历数组,判断是否符合条件
        for(int i = 0;i < arr.length;i++){
            if(arr[i] % 3 == 0 && arr[i] % 5 ==0){
                b++;
            }
        }
        System.out.println("1~" + num + "之间,同时能被3和5整除的数有" + b +"个");
    }
}