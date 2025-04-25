//Day07
package API_Demo.Demo1.String_Demo.Demo3;
//String substring(int beginIndex,int endIndex)     截取
//从一个字符串中截取另一个字符串,括号内为起始和终止角标(包头不包尾,包左不包右 )
//String str = "0123456789";
//str.substring(2,4);

//手机号屏蔽:输入一个11位手机号,自动屏蔽中间5到8位
//即输入12649268564 输出126****8564

//public String replace(char oldChar, char newChar)
//将字符串中所有的 oldChar 替换为 newChar
//public String replace(CharSequence target, CharSequence replacement)
//将字符串中所有的 target 子字符串替换为 replacement
//public char[] toCharArray()
//将字符串转化为一个字符串数组

//Day10
//public boolean strartsWith(String prifix)
//判断字符串是否以指定的前缀开头,如果字符串以指定的前缀开头，返回 true，否则返回 false
//public boolean strartsWith(String prifix,int offset)
//判断字符串从指定偏移量开始的子字符串是否以指定的前缀开头,如果从偏移量开始的子字符串以指定的前缀开头，返回 true，否则返回 false

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入手机号");
        String str = scan.nextLine();
        if(str.length() != 11){
            System.out.println("请输入正确的手机号");
        }else{
            System.out.println(str.substring(0,3) + "****" + str.substring(7,10) + str.charAt(10));
        }
    }
}
