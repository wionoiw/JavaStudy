//Day08
package API_Demo.Demo1.String_Demo.Test10;
//给定两个字符串形式的非负整数num1和num2，返回num1和num2的乘积,它们的乘积也表示为字符串形式
import java.util.Scanner;

public class StringTest10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入num1:");
        int num1 = zhuanHuan(scan.next());
        System.out.print("\n请输入num2:");
        int num2 = zhuanHuan(scan.next());
        System.out.print("\n" + num1 + "和" + num2 + "的乘积为" + (num1 * num2 +""));
    }

    //将字符串转化为数字
    public static int zhuanHuan(String str){
        int temp = 0;
        //判断temp中是否存入数据
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                temp = 10 * temp + (str.charAt(i) - '0');
            }
        }
        return temp;
    }
}
