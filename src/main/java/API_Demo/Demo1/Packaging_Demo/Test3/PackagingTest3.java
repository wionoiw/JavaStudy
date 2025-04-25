package API_Demo.Demo1.Packaging_Demo.Test3;

import java.util.Scanner;

/**
 * @Author HHH
 * @Date 2025/4/19 18:38
 * @Day Day23
 */

//需求
//定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
public class PackagingTest3 {
    public static void main(String[] args){
        System.out.println("请输入要转为二进制的正整数");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num = Integer.parseInt(str);
        String Str = toBinaryString(num);
        System.out.println(str + "转为二进制为:" + Str);
        System.out.println(Str + "转为十进制为:" + toInt(Str));
    }

    //实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
    public static String toBinaryString(int num){
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            sb.append(num % 2);
            num /= 2;
        }
        StringBuilder Sb = sb.reverse();
        return Sb.toString();
    }

    //将二进制数转化为int类型
    public static int toInt(String str){
        char[] arr =str.toCharArray();
        int temp = 0;
        for(int i =0; i < arr.length; i++){
            temp = temp * 2 + (arr[i] - '0');
        }
        return  temp;
    }
}
