package API_Demo.Demo1.String_Demo.RegularExpression_Demo.Demo4;

import java.util.StringJoiner;

/**
 * @Author HHH
 * @Date 2025/4/17 16:48
 * @Day Day21
 */

//通过正则表达式对字符串进行替换或切割

//有一段字符串：小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
//要求1：把字符串中三个姓名之间的字母替换为vs
//要求2：把字符串中的三个姓名切割出来

//正则表达式在字符串方法中的使用
//public boolean matches(String regex)                      判断字符串是否满足正则表达式的规则
//public String replaceAll(String regex,String newStr)      按照正则表达式的规则进行替换
//public String[] split(String regex)                       按照正则表达式的规则切割字符串
public class RegularExpressionDemo4 {
    public static void main(String[] args){
        //要匹配的字符串
        String str = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        System.out.println("原字符串");
        System.out.println(str);
        //正则表达式
        String regex = "[\\w&&[^_]]+";
        //替换
        System.out.println("替换后的字符串");
        //细节:
        //方法在底层跟之前一样也会创建文本解析器的对象
        //然后从头开始去读取字符串中的内容,只要有满足的,那么就用第二个参数去替换。
        String Str = str.replaceAll(regex,"vs");
        System.out.println(Str);
        //切割字符串
        System.out.println("切割后的字符串");
        String[] arr = str.split(regex);
        StringJoiner sj = new StringJoiner(",","[","]");
        for(int i = 0;i < arr.length;i++){
            sj.add(arr[i]);
        }
        System.out.println(sj.toString());
    }
}
