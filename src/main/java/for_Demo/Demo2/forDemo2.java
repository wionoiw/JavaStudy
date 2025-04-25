//Day02
package for_Demo.Demo2;
//需求:键盘输入两个数字表示一个范围，统计这个范围中
//既能被3整除,又能被5整除的数字有多少个
import java.util.Scanner;

public class forDemo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请在键盘上输入两个整数");
        //用户在键盘上输入两个整数
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        //定义一个变量nummax,用于在两个数中比较大小,存储较大的值
        int nummax = num1 > num2 ? num1 : num2;
        //定义一个变量nummin,用于在两个数中比较大小,存储较小的值
        int nummin = num1 < num2 ? num1 : num2;
        //定义一个变量a用于计数范围中既能被3整除,又能被5整除的数字有多少个
        int a = 0;
        for(int i = nummin;i <= nummax;i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                a++;
            }
        }
        System.out.println("在"+ nummin + "和" + nummax + "之间符合条件的有" + a + "个");
    }
}