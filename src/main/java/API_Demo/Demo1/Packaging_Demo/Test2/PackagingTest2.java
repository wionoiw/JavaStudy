package API_Demo.Demo1.Packaging_Demo.Test2;

import java.util.Scanner;

/**
 * @Author HHH
 * @Date 2025/4/19 18:03
 * @Day Day23
 */

//自己实现parseInt方法的效果,将字符串形式的数据转成整数
//要求:
//字符串中只能是数字不能有其他字符
//最少一位，最多10位
//0不能开头
public class PackagingTest2 {
    //字符串中数是否合法
    static boolean count = false;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        String str = scanner.nextLine();
        int num = parseInt(str);
        if(num == 0 && !count){
            System.out.println("传入的字符串不合法");
            return;
        }
        System.out.println(num);
    }

    //实现parseInt方法,将字符串形式的数据转成整数
    public static int parseInt(String str){
        //判断传入的字符串是否合法
        if(str.matches("([\\d&&[^0]]\\d{0,9})||(-[\\d&&[^0]]\\d{0,9})||0")){
            count = true;
            return parseInt_1(str);
        }
        return 0;
    }

    //将符合要求的字符串转化为整数
    public static int parseInt_1(String str){
        int temp = 0;
        char[] arr = str.toCharArray();
        //判断是否为负
        if(arr[0] == '-'){
            for(int i = 1; i < arr.length;i++){
                temp = 10*temp + (arr[i] - '0');
            }
            return -temp;
        }
        //正数
        for(int i = 0; i < arr.length;i++){
            temp = 10*temp + (arr[i] - '0');
        }
        return temp;
    }
}
