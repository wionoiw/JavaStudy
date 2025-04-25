//Day03
package Method_Demo.Test5;
//需求: 输入一个数,判断0到该数之间有多少个质数
import java.util.Scanner;

public class MethodTest5 {
    public static void main(String[] orgs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数,程序将判断0到该数之间有多少个质数:");
        int num = scanner.nextInt();
        System.out.print("0到"+ num +"之间有" + xunHuan(num) + "个质数:");
    }


    //循环判断(从1~num开始计数)
    public static int xunHuan(int num){
        //计数质数的个数
        int n = 0;
        for(int i = 1 ;i <= num;i++){
           if(panDuan(i)){
               n++;
           }
        }
        return n;
    }

    //判断一个数是否是质数
    public static boolean panDuan(int num){
        //求出num的最大平方根的整数部分
        int n = pingFangGen(num);
        //3及3以下不再进行判断
        if(num <= 1){
            return false;
        }else if(num <= 3){
            return true;
        }
        //判断一个数是否是质数
        for(int i = 2 ;i <= n;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    //求出num的最大平方根的整数部分
    public static int pingFangGen(int num){
        int i = 1;
        while(i * i < num){
            i++;
        }
        return i;
    }
}
