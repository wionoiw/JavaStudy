//Day02
package Arithmeticoperator_Demo.Demo3;
//三元运算符 a == b ? 相同 : 不同 ;
//键盘输入两个数，输出最大数
import java.util.Scanner;

public class ArithmeticoperatorDemo3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请分别输入两个整数:");
        //输入第一个数a
        int a = scanner.nextInt();
        //输入第二个数b
        int b = scanner.nextInt();
        System.out.println("最大数是:" + (a == b ? a : b));
    }
}
