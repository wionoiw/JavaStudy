//Day06
package API_Demo.Demo1.String_Demo.Demo2;
//String 的两个成员方法
//public char charAt(int index);  根据索引返回字符串相应字符
//public int length();              返回此字符串的长度

//统计字符次数
//键盘录入一个字符串,统计该字符串中，大写字母字符,小写字母字符,数字字符出现的次数
import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scan.next();
        int upNum = 0;
        int lowNum = 0;
        int numNum = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                numNum++;
            }else if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                upNum++;
            }else if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
                lowNum++;
            }
        }
        System.out.println("在" + str + "中,大写字母有"
                            + upNum + "个,小写字母有"
                            + lowNum + "个,数字有"
                            + numNum + "个");
    }
}
