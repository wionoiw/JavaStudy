//Day02
package for_Demo.Test1;
//需求:给你一个整数x,如果x是一个回文数,打印true,否则打印false
//回文数是指正序(从左到右)和倒序(从右到左)读都是一样的整数
//例如:121,343

//思路:假设一个位数为a的正整数,那么它由每一位的位数乘以b(b为10的该位数次方)累加得来
import java.util.Scanner;

public class forTest1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //用户输入正整数
        System.out.println("请输入一个正整数:");
        //定义变量num接收键盘输入的数
        int num = scanner.nextInt();
        //定义变量a来对num的位数进行计数
        int a1 = 1;
        //定义变量b来对位数进行计算
        int b1 = 10;

        //计算num的位数
        while(num / b1 != 0){
            b1 *= 10;
            a1++;
        }

        //将num倒转过来,定义mun来接受倒转后的数
        int mun = 0;
        //定义变量a2,通过num / a2 % 10 得到其位数
        int a2 = 1;
        for(int n = a1;n >= 1;n--){
            int b2 = 1;
            for(int i = n;i > 1;i--){
                b2 *= 10;
            }
            //依次取num的位数
            mun += num / a2 % 10 * b2;
            a2 *= 10;
        }

        //对num和mun是否相等进行判断
        if(num == mun){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

////https://www.bilibili.com/video/BV17F411T7Ao?t=249.4&p=48
////范例
//public class ForTest1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //用户输入正整数
//        System.out.println("请输入一个正整数:");
//        //定义变量num接收键盘输入的数
//        int num = scanner.nextInt();
//        int temp = num;
//        //定义变量mun接收num倒过来的数
//        int mun = 0;
//        while (temp != 0) {
//            int x = temp % 10;
//            temp /= 10;
//            mun = mun * 10 + x;
//        }
//        System.out.println(mun == num);
//    }
//}