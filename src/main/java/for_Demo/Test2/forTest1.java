//Day02
package for_Demo.Test2;

//需求: 键盘录入一个正整数,判断它是否是质数
import java.util.Scanner;

public class forTest1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        //定义变量num接收键盘输入的数
        int num = scanner.nextInt();

        for(int i = 2;i < num;i++){
            if(num % i == 0){
                System.out.println("该数不是一个质数");
                break;
            }else if(num - 1 == i){
                System.out.println("该数是一个质数");
            }
        }
        if( num <= 2){
            System.out.println("该数是一个质数");
        }
    }
}
