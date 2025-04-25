package API_Demo.Demo1.String_Demo.RegularExpression_Demo.Demo2;

//有如下文本，请按照要求爬取数据。
//Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
//因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久JaVa17也会逐渐登上历史舞台
//要求：找出里面所有的JavaXX

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author HHH
 * @Date 2025/4/17 13:12
 * @Day Day21
 */

//爬虫分为本地爬虫和网络爬虫

//Pattern类        正则表达式对象
//Matcher类        文本匹配器，作用按照正则表达式的规则去读取字符串，从头开始读取

//public boolean matches(String regex);                 //regex是正则表达式,表示对字符串进行正则表达式校验


public class RegularExpressionDemo2 {
    public  static void main(String[] args){
        String str="Java自从95年问世以来,经历了很多版本,目前企业中用的最多的是Java8和Java11,"+
                    "因为这两个是长期支持版本,下一个长期支持版本是Java17,相信在未来不久JaVa17也会逐渐登上历史舞台";

//        method1(str);

        //获取正则表达式的对象
        Pattern pattern = Pattern.compile("Java\\d{0,2}");
        //m要在str中找符合pattern规则的小串
        Matcher m = pattern.matcher(str);
        //3.利用循环获取
        //m.find()检索到符合要求的字符串会返回true
        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }


    }

    //截取字符串中符合要求的子字符串
    private static void method1(String str) {
        //获取正则表达式的对象
        Pattern pattern = Pattern.compile("Java\\d{0,2}");
        //获取文本匹配器的对象
        //m:文本匹配器的对象
        //str:大串
        //pattern:规则
        //m要在str中找符合pattern规则的小串
        Matcher m = pattern.matcher(str);

        //注意,即使不使用find()返回的值,也需要在调用group()之前进行调用find()方法,否则不会在底层记录子串的起始索引和结束索引+1,group()方法会报错
        //拿着文本匹配器从头开始读取，寻找是否有满足规则的子串
        //如果有,方法返回true; 如果没有,方法返回false
        //如果有，返回true。在底层记录子串的起始索引和结束索引+1
        //0,4
        boolean b = m.find();

        //方法底层会根据find方法记录的索引进行字符串的截取
        //subString(起始索引,结束索引):包头不包尾
        //(0,4)但是不包含4索引
        //会把截取的小串进行返回
        String s1 =m.group();
        System.out.println(s1);
    }
}
