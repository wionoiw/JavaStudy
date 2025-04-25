package API_Demo.Demo1.String_Demo.RegularExpression_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/17 11:27
 * @Day Day21
 */

//pattern类        正则表达式对象
//Matcher类        文本匹配器，作用按照正则表达式的规则去读取字符串，从头开始读取

//public boolean matches(String regex);                 //regex是正则表达式,表示对字符串进行正则表达式校验

//正则表达式的作用
//作用一：校验字符串是否满足规则
//作用二：在一段文本中查找满足要求的内容

//正则表达式匹配字符是一个一个匹配的

//字符类(只匹配一个字符）
//[abc]                     只能是a,b,或c
//[^abc]                    除了a,b,c之外的任何字符
//[a-zA-Z]                  a到z A到Z，包括（范围）
//[a-d[m-p]]                a到d，或m到p
//[a-z&&[def]]              a-z和def的交集。为：d,e,f
//[a-z&&[^bc]]              a-z和非bc的交集(等同于[ad-z])
//[a-z&&[^m-p]]             a到z和除了m到p的交集(等同于[a-lq-z])
    //细节：如果要求两个范围的交集，那么需要写符号&&
    //如果写成了一个&，那么此时&表示就不是交集了，而是一个简简单单的&符号

//预定义字符（只匹配一个字符）
//.                         任何字符
//\d                        一个数字：[0-9]
//\D                        非数字：[^0-9]
//\s                        一个空白字符：[\t\n\xOB\f\r]
//\S                        非空白字符：[^\s]
//\w                        [a-zA-Z_0-9]英文、数字、下划线
//\w                        [^\w]一个非单词字符

//数量词
//X?                        X,1次或0次
//X*                        X,零次或多次
//X+                        X,一次或多次
//X{n}                      X,正好n次
//X{n,}                     X，至少n次
//X[n,m}                    X,至少n但不超过m次

//忽略大小写
//(?i)abc                   忽略abc大小写进行匹配
//a(?i)bc                   忽略bc大小写进行匹配
//a((?i)b)c                 忽略b大小写进行匹配
public class RegularExpressionDemo1 {
}
