package API_Demo.Demo1.String_Demo.RegularExpression_Demo.Demo3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author HHH
 * @Date 2025/4/17 16:18
 * @Day Day21
 */

//带条件爬取,贪婪爬取

//Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长
//期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
//需求1：爬取版本号为8,11,17的Java文本，但是只要Java，不显示版本号。
//需求2：爬取版本号为8,11,17的Java文本。正确爬取结果为：Java8 Java11 Java17 Java17
//需求3：爬取除了版本号为8,11,17的Java文本


//只写+和*表示贪婪匹配
//+?非贪婪匹配
//*?非贪婪匹配
//贪婪爬取：在爬取数据的时候尽可能的多获取数据
//非贪婪爬取：在爬取数据的时候尽可能的少获取数据

//Java当中，默认的就是贪婪爬取
//如果我们在数量词+*的后面加上问号，那么此时就是非贪婪爬取

//有如下文本，请按照要求爬取数据。
//abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa
//需求1：按照ab+的方式爬取ab，b尽可能多获取
//需求2：按照ab+的方式爬取ab，b尽可能少获取
public class RegularExpressionDemo3 {
    public static void main(String[] args){
        daaTiaoJianPaQu();
        tanLanPaQu();
    }

    //带条件爬取
    public static void daaTiaoJianPaQu(){
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长\n" +
                "期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        //1.定义正则表达式
        //?理解为前面的数据Java
        //=表示在Java后面要跟随的数据
        //但是在获取的时候，只获取前半部分
        //需求1:获得爬取数据的一部分
        String regex1 ="(（?i)Java)(?=8|11|17)";
        //需求2:获得爬取数据的全部
        String regex2 ="((?i)Java)(8|11|17)";
        String regex3 ="((?i)Java)(?:8|11|17)";
        //需求3:忽略部分数据进行爬取
        String regex4 ="((?i)Java)(?!8|11|17)";

        Pattern pattern = Pattern.compile(regex4);
        Matcher m = pattern.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }
    }

    //贪婪爬取
    public static void tanLanPaQu(){
        String str = "abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa";
        //贪婪爬取
        String regex1 = "ab+";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher m1 = pattern1.matcher(str);
        m1.find();
        System.out.println(m1.group());
        //非贪婪爬取
        String regex2 = "ab+?";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher m2 = pattern2.matcher(str);
        m2.find();
        System.out.println(m2.group());


    }
}
