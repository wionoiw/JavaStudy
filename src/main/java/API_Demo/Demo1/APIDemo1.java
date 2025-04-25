//Day05
package API_Demo.Demo1;
//API(Application Programming Interface)  应用程序编程接口
//javaAPI指的就是JDK中提供各种功能的类

import java.util.Scanner;

//需求:键盘录入一个小数,在控制台输出
public class APIDemo1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个小数");
        double a = scan.nextDouble();
        System.out.println("你输入的小数是" + a);
    }
}
