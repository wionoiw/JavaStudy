//Day02
package while_Demo.Test1;
//给定两个整数,被除数和除数(都是正数,且不会超出int的范围),将两数相除,
//要求不使用乘法,除法,%运算符,得到商和余数
import java.util.Scanner;

public class whileTest1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入被除数");
        //定义num1来接收被除数
        int num1 = scanner.nextInt();
        System.out.println("请输入除数");
        //定义num2来接收除数
        int num2 = scanner.nextInt();
        //定义a作为两数之除的商
        int a = 0;
        //定义temp作为两数之除的余数
        int temp = num1;
        while(temp >= num2){
            temp -= num2;
            a++;
        }
        System.out.println(num1 + "除以" + num2 + "的商是"
                + a + ",余数是" + temp);
    }
}