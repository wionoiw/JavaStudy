package API_Demo.Demo1.Math_Demo.Test1;

import java.util.Scanner;

/**
 * @Author HHH
 * @Date 2025/4/14 14:52
 * @Day Day18
 */

//键入一个数,判断其是否是自幂数
//自幂数,一个n位自然数等于自身各个数位上数字的n次幂之和
public class MathTest1 {
    public static void main(String[] args){
        while(true){
            ifnum();
        }

    }

    private static void ifnum(){
        System.out.println("请输入一个正整数,判断其是否是自幂数");
        int num = new Scanner(System.in).nextInt();
        //判断输入的数是否为正整数
        if (num <= 0){
            System.out.println("请输入一个正整数");
            return;
        }
        //记录num的值
        int Num = num;

        //记录当前位数
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }

        num = Num;
        //记录各个数位上数字的n次幂之和
        int temp = 0;
        while(num != 0){
            temp += (int)Math.pow((num % 10),count);
            num /= 10;
        }

        if(Num == temp){
            System.out.println(Num + "是自幂数");
        }else{
            System.out.println(Num + "不是自幂数");
        }
    }
}
