//Day08
package API_Demo.Demo1.String_Demo.Test8;
//需求:键盘输入字符串,随机打乱内容

import java.util.Random;
import java.util.Scanner;

public class StringTest8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        System.out.println(daLuan(scan.nextLine()));
    }

//    //随机打乱字符串内容
//    public static String daLuan(String str){
//        Random ran = new Random();
//        //创建字符串数字存储字符串每个字符
//        String[] strArr = new String[str.length()];
//        for(int i = 0;i < str.length();i++){
//            strArr[i] = str.charAt(i) + "";
//        }
//        //创建StringBuilder对象用于接收新数组
//        StringBuilder sb = new StringBuilder();
//        //用于计数
//        int count = 0;
//        while(count != strArr.length){
//            int temp = ran.nextInt(strArr.length);
//            if(strArr[temp] != null){
//                sb.append(strArr[temp]);
//                strArr[temp] = null;
//                count++;
//            }
//        }
//        return sb.toString();
//    }

    //随机打乱字符串内容
    public static String daLuan(String str){
        Random ran = new Random();
        //将字符串转换为字符数组
        char[] charArr = str.toCharArray();
        //存储临时字符
        char temp = charArr[0];
        for(int i = 0;i < charArr.length;i++){
            int num = ran.nextInt(charArr.length);
            temp = charArr[i];
            charArr[i] = charArr[num];
            charArr[num] = temp;
        }
        String Str = new String(charArr);
        return Str;
    }
}
