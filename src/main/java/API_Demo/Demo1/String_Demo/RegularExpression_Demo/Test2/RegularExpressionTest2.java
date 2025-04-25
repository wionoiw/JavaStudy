package API_Demo.Demo1.String_Demo.RegularExpression_Demo.Test2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author HHH
 * @Date 2025/4/17 13:42
 * @Day Day21
 */

//需求：把下面文本中的电话，邮箱，手机号，热线都爬取出来。
//来黑马程序员学习Java,
//电话：18512516758，18512508907
//或者联系邮箱：boniu@itcast.cn,
//座机电话：01036517895，010-98951256
//邮箱：bozai@itcast.cn,
//热线电话：400-618-9090，400-618-4000，4006184000，4006189090
public class RegularExpressionTest2 {
    public static void main(String[] args){
        String str = "来黑马程序员学习Java,\n" +
                "电话:18512516758,18512508907\n" +
                "或者联系邮箱:boniu@itcast.cn,\n" +
                "座机电话:01036517895，010-98951256\n" +
                "邮箱:bozai@itcast.cn,\n" +
                "热线电话:400-618-9090,400-618-4000,4006184000,4006189090";
        Test(str);
    }

    //爬取文本
    private static void Test(String str){
        //爬取电话号码
        System.out.println("----------电话号码----------");
        String patternText1 = "1\\d{10}";
        ifText(str,patternText1);
        //爬取邮箱
        System.out.println("----------邮箱----------");
        String patternText2 = "[\\w&&[^0]]\\w*@([a-zA-Z0-9]+\\.[a-zA-Z]+)+";
        ifText(str,patternText2);
        //爬取座机号码
        System.out.println("----------座机号码----------");
        String patternText3 = "010-?\\d{8}";
        ifText(str,patternText3);
        //爬取热线电话
        System.out.println("----------热线电话----------");
        String patternText4 = "400-?\\d{3}-?\\d{4}";
        ifText(str,patternText4);
    }

    //爬取文本
    private static void ifText(String str,String patternText){
        Pattern pattern = Pattern.compile(patternText);
        Matcher m = pattern.matcher(str);
        while(m.find()){
            String Str = m.group();
            System.out.println(Str);
        }
    }
}
