//Day08
package API_Demo.Demo1.String_Demo.Test6;
//需求,键盘录入一个字符串
//要求1:长度为小于等于9
//要求2:只能是数字
//将内容变为罗马数字
//下面是阿拉伯数字和罗马数字的对比关系:
//Ⅰ - 1、Ⅱ - 2、Ⅲ - 3、Ⅳ - 4、Ⅴ - 5、Ⅵ - 6、Ⅶ - 7、Ⅷ - 8、Ⅸ - 9
//注意点:罗马数字里是没有0的
//如果键盘录入的数字包含0,可以变成""(长度为零的字符串)
import java.util.Scanner;

public class StringTest6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入符合要求的字符串");
        System.out.println(zhuanHuan(scan.next()));
    }

    //转换字符串
    public static String zhuanHuan(String str){
        //判断字符串是否符合要求
        if(panDuan(str)){
            String[] strArr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i < str.length();i++){
                sb.append(strArr[str.charAt(i) - '0']);
            }
            return sb.toString();
        }
        return "输入的字符串不符合要求";
    }

    //判断字符串是否符合要求
    public static boolean panDuan(String str){
        //判断长度
        if(str.length() > 9){
            return false;
        }
        //判断每一位字符是否是数字
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }
}
