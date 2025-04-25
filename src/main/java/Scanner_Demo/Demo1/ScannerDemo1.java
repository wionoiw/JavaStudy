//Day01
package Scanner_Demo.Demo1;

//导包，Scanner类键盘输入
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //创建对象使用Scanner类
        Scanner scanner = new Scanner(System.in);
        //接收第一个数据
        int a = scanner.nextInt();
        //接收第二个数据
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
