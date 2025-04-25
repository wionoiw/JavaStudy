//Day08
package API_Demo.Demo1.String_Demo.Test9;
//需求:
//生成验证码
//内容(大小写字母或数字)
//规则:长度为5,其中四位字母,一位数字,数字可以出现在任何位置
import java.util.Random;
import java.util.Scanner;

public class StringTest9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入验证码的长度:");
        int a = scan.nextInt();
        System.out.print("\n请输入验证码中数字个数:");
        shengChen(a,scan.nextInt());
    }

//    //随机生成验证码,a为验证码长度,b为数字个数
//    public static void shengChen(int a,int b){
//        Random ran = new Random();
//        //创建字符串数组,存储验证码
//        char[] arr = new char[a];
//        //随机判断是否大写
//        int ifBig = 0;
//        for(int i = 0;i < a;i++){
//            ifBig = ran.nextInt(1);
//            if(ifBig == 0){
//                arr[i] = (char)(ran.nextInt('z' - 'a' + 1) + 'a');
//            }else{
//                arr[i] = (char)(ran.nextInt('Z' - 'A' + 1) + 'A');
//            }
//        }
//        //随机插入随机数字
//        int wei = 0;
//        for(int i = 0;i < b;i++){
//            wei = ran.nextInt(a);
//            arr[wei] = (char)(ran.nextInt(10) + '0');
//        }
//        //用字符数组创建字符串
//        String str = new String(arr);
//        System.out.println("\n" + str);
//    }
//随机生成验证码,a为验证码长度,b为数字个数
    public static void shengChen(int a,int b){
        Random ran = new Random();
        //创建码表
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
                        'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
        };
        //创建字符串数组,存储验证码
        char[] charArr = new char[a];
        for(int i = 0;i < a;i++){
            charArr[i] = arr[ran.nextInt(52)];
        }
        //随机插入随机数字
        int wei = 0;
        for(int i = 0;i < b;i++){
            wei = ran.nextInt(a);
            charArr[wei] = (char)(ran.nextInt(10) + '0');
        }
        //用字符数组创建字符串
        String str = new String(charArr);
        System.out.println("\n" + str);
    }
}
