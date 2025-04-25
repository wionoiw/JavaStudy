//Day02
package switch_Demo.Test1;
//机票预订电话
//1.机票查询
//2.机票预订
//3.机票改签
//4.退出服务，其他按键也是退出服务
import java.util.Scanner;

public class switchTest1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //定义一个bool变量b用于控制while循环
        boolean b = true;
        //while循环重复使用机票预订电话
        while(b){
            System.out.println("欢迎使用机票预订电话\n按1机票查询\n按2机票预订\n按3机票改签\n按4退出服务");
            //用户输入按键
            int a = scanner.nextInt();
            switch(a){
                case 1 :
                    System.out.println("正在进行机票查询\n");
                    break;
                case 2 :
                    System.out.println("正在进行机票预订\n");
                    break;
                case 3 :
                    System.out.println("正在进行机票改签\n");
                    break;
                default :
                    //退出服务，退出改变bool变量的值来退出while循环
                    b = false;
                    System.out.println("已退出服务");
                    break;
            }
        }
    }
}
