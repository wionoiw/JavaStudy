//Day02
package if_Demo.Test1;
//键盘录入一个大于等于2的整数x,计算并返回x的平方根
//结果仅保留整数部分,小数部分舍去
import java.util.Scanner;

public class ifTest1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数");
        //定义键盘录入的整数为x
        int x = scanner.nextInt();
        for(int i = 1;;i++ ){
            if(i * i > x){
                System.out.println(x + "的平方根是" + (i - 1));
                break;
            }
        }
    }
}