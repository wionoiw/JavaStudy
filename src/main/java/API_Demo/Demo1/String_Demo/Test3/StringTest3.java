//Day06
package API_Demo.Demo1.String_Demo.Test3;
//定义一个方法实现字符串反转
//键盘录入一个字符串,调用该方法后，在控制台输出结果
//例如键盘输入abc,结果输出cba
import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符串,程序将将其反转输出");
        String str = scan.nextLine();
        System.out.println(fanZhuan(str));
    }

    //字符串反转
    public static String fanZhuan(String str){
        String Str = "";
        for(int i = 0; i < str.length() ;i++){
            Str += str.charAt(str.length() - 1 -i);
        }
        return Str;
    }


}
