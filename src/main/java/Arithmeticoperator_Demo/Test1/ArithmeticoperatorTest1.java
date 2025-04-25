//Day01
package Arithmeticoperator_Demo.Test1;

import java.util.Scanner;

public class ArithmeticoperatorTest1 {
    //键盘输入一个三位数，并分别输出其个位十位百位
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数:\n");
        int number = scanner.nextInt();
        //求个位数a
        int a = number % 10;
        //求十位数b
        int b = number / 10 % 10;
        //求百位数c
        int c = number / 100 % 10;
        System.out.println("\n个位数是:" + a + "\n十位数是:" + b + "\n百位数是:" + c);
    }
}
