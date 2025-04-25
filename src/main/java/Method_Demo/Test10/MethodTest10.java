//Day03
package Method_Demo.Test10;
//需求:输入一个加密后的密码,将其解密
//加密规则:得到每一位数,然后每位数都加上五,再对10求余,最后将所有数字反转,得到一串新数
//例如: 1983
//       1    9   8   3
//加5    6   14  13  8
//求余    6   4   3   8
//反转    8   3   4   6
//机密后为8346
import java.util.Scanner;
public class MethodTest10 {
    public static void main(String[] orgs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个要解密的密码:");
        System.out.print("解密后为" + JieMi(scanner.nextInt()));

    }

    //解密
    public static int JieMi(int num){
        int m = WeiShu(num);
        int temp = 0;
        while(true){
            if((num % 10)  >= 5){
                temp = temp * 10 + (num % 10) - 5;
            }else{
                temp = temp * 10 + (num % 10) + 5;
            }
            if(num / 10 == 0){
                break;
            }
            num /= 10;
        }

        return temp;
    }

    //求位数
    public static int WeiShu(int num){
        int i = 1;
        while(num / 10 != 0){
            i++;
            num /= 10;
        }
        return i;
    }

}
