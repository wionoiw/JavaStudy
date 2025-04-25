//Day08
package API_Demo.Demo1.String_Demo.Test7;
//需求
//给定两个字符串,A和B
//A的旋转操作就是将A最左边的字符移动到最右边
//例如,若A="abcde",在移动之后结果就是"bcdea"
//如果在经历若干次调整操作之后,A能变成B,那么返回true
//如果不能匹配成功,则返回false
import java.util.Scanner;

public class StringTest7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符串A");
        String A = scan.nextLine();
        System.out.println("请输入字符串B");
        System.out.println("对比结果:" + duiBi(A,scan.nextLine()));
    }

    //将A旋转若干次后,与B进行对比
    public static boolean duiBi(String A,String B){
        for(int i = 0;i < A.length();i++){
            A = xuanZhuan(A);
            if(A.equals(B)){
                return true;
            }
        }
        return false;
    }

    //旋转字符串
    public static String xuanZhuan(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(1)).append(str.charAt(0));
        return sb.toString();
    }
}
