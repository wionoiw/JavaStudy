package API_Demo.Demo1.Packaging_Demo.Integer_Demo.Demo2;

/**
 * @Author HHH
 * @Date 2025/4/19 16:51
 * @Day Day23
 */
//Integer 成员方法
    //public static String toBinaryString(int i)                    //得到二进制
    //public static String toOctalString(int i)                     //得到八进制
    //public static String toHexString(int i)                       //得到十六进制
        //使用String作为进制转换返回值类型原因
            //1.十六进制中有字母无法存储进int,long等类型,String类型可以存储任意字符
            //2.int,long类型有长度限制,如int类型最多存储十位数字,如果存入较大二进制数就会溢出,String类型没有长度限制
    //public static int parseInt(String s)                          //将字符串类型的整数转成int类型的整数
        //细节1:
            //在类型转换的时候,括号中的参数只能是数字不能是其他,否则代码会报错
        //细节2:
            //8种包装类当中,除了character都有对应的parseXxx的方法,进行类型转换(parseXxx(String s) 字符串转Xxx)
public class IntegerDemo2 {
}
