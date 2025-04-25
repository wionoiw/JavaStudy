package while_Demo.Test2;

import java.util.Scanner;

/**
 * @Author HHH
 * @Date 2025/4/14 14:22
 * @Day Day18
 */

//随机键入一个数,判断它是不是质数
public class whileTest2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while(true){
            System.out.println("请输入一个正整数,来判断其是否是质数");
            num = scanner.nextInt();
            if(num <= 0){
                System.out.println("请输入一个正整数");
            }else{
                break;
            }
        }
        //输入的数为1,2,3是直接输出
        if(num <= 3){
            System.out.println(num + "是质数");
            return;
        }
        //输入的数为偶数直接输出
        if(num % 2 == 0){
            System.out.println(num + "不是质数");
            return;
        }
        //循环判断是否是质数
        for(int i = 3;i*i <= num;i++){
            if(num % i == 0){
                System.out.println(num + "不是质数");
                return;
            }
        }
        System.out.println(num + "是质数");
    }
}
