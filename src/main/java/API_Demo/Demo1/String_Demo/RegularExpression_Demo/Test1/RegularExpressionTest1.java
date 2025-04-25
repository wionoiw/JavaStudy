package API_Demo.Demo1.String_Demo.RegularExpression_Demo.Test1;

/**
 * @Author HHH
 * @Date 2025/4/17 12:16
 * @Day Day21
 */

//请编写正则表达式验证用户名是否满足要求。
//要求：大小写字母，数字，下划线一共4-16位
//请编写正则表达式验证身份证号码是否满足要求。
//简单要求：18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
//复杂要求：按照身份证号码的格式严格要求
    //1.地址码：前六位，非0开头
    //2.出生年份：四位数字，范围为1800-3999年。
    //3.月份：两位数字，范围为01-12月。
    //4.日期：两位数字，范围为01-31天。
    //5.顺序码：三位数字。
    //6.校验码：一位数字或字母X/x1
public class RegularExpressionTest1 {
    public static void main(String[] args){
        String name = "aiuhfjns";
        String ID = "410411200102250028";
        ifUserName(name);
        ifUserID(ID);
        ifUserID_ez(ID);
    }

    //判断用户名是否符合要求
    public static void ifUserName(String name){
        boolean temp =  name.matches("\\w{4,16}");
        if(temp){
            System.out.println("用户名" + name + "满足要求");
        }else {
            System.out.println("用户名" + name + "不满足要求");
        }
    }

    //判断身份证号码是否符合要求(简单)
    public static void ifUserID_ez(String ID){
        boolean temp =  ID.matches("\\d{17}[\\dxX]");
        if(temp){
            System.out.println("身份证号码" + ID + "满足要求");
        }else {
            System.out.println("身份证号码" + ID + "不满足要求");
        }
    }

    //判断身份证号码是否符合要求(复杂)
    public static void ifUserID(String ID){
        boolean temp =  ID.matches("[\\d^0]\\d{5}((1[89]\\d{2})|([23]\\d{3}))((0[\\d^0])|(1[012]))" +
                "((0[\\d^0])|([12]\\d)|(3[01]))\\d{3}[\\dxX]");
        if(temp){
            System.out.println("身份证号码" + ID + "满足要求");
        }else {
            System.out.println("身份证号码" + ID + "不满足要求");
        }
    }
}
