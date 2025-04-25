//Day03
package Method_Demo.Test8;
//需求:键盘输入一个数(大于0),将数字加密
//加密规则:得到每一位数,然后每位数都加上五,再对10求余,最后将所有数字反转,得到一串新数
//例如: 1983
//       1    9   8   3
//加5    6   14  13  8
//求余    6   4   3   8
//反转    8   3   4   6
//机密后为8346
//可以加密7686570
import java.util.Scanner;

public class MethodTest8 {
    public static void main(String[] orgs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个要加密的数:");
        System.out.print("加密后为" + JiaMi(scanner.nextInt()));
    }
    //加密
    public static int JiaMi(int num){
        int temp = 0;
        while(true){
            int m = num % 10;
            int n = (m + 5) % 10;
            temp = temp * 10 + n;
            if(num / 10 == 0){
                break;
            }
            num /= 10;
        }
      return temp;
    }
}
