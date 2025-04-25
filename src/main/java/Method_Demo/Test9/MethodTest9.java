//Day03
package Method_Demo.Test9;
//需求: 键入一个整数,将整数的每一位添加到数组当中
import java.util.Scanner;

public class MethodTest9 {
    public static void main(String[] orgs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数:");
        int num = scanner.nextInt();
        BianLi(ChuLi(num));
    }



    //遍历数组
    public static void BianLi(int[] arr){
        System.out.print("[");
       for(int i = 0;i < arr.length;i++){
           System.out.print(arr[i]);
           if(i != arr.length - 1){
               System.out.print(",");
           }
       }
        System.out.print("]");
    }

    //判断位数
    public static int WeiShu(int num){
        int i = 1;
        while(num / 10 != 0){
            i++;
            num /= 10;
        }
        return i;
    }

    //将整数的每一位添加到数组当中
    public static int[] ChuLi(int num){
        int[] arr = new int[WeiShu(num)];
        for(int i = arr.length - 1;i >= 0;i--){
            arr[i] = num % 10;
            num /= 10;
        }
        return arr;
    }
}
