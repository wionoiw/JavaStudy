//Day07
package API_Demo.Demo1.String_Demo.Test5;
//身份证信息查看
//1~2位省位
//3~位城市
//5~6位区县
//7~14位出生年月日
//15~~16位所在地派出所
//17位性别(奇数男性,偶数女性)
//18位个人信息码(随机产生)

//需求:输入身份证号,输出出生年月日和性别
//人物信息为:
//出生年月日:XXXX年XX月XX日
//性别:男/女
import java.util.Scanner;

public class StringTest5 {
    public static void main(String[] args){
        System.out.println("请输入身份证号");
        yanZheng();
    }

    //判断身份证格式是否正确
    public static boolean geShi(String str){
        //年份
        int temp = 0;
        for(int i = 6;i < 10;i++){
            temp = temp * 10 + (str.charAt(i) - '0');
        }
        //月份
        int temp1 = (str.charAt(10) - '0') * 10 + (str.charAt(11) - '0');
        //日期
        int temp2 = (str.charAt(10) - '0') * 10 + (str.charAt(11) - '0');

        if(temp1 == 1 || temp1 == 3 || temp1 == 5 || temp1 == 7 || temp1 == 8 || temp1 == 10 || temp1 == 12){
            if(temp2 > 0 && temp2 < 32){
                return true;
            }
        }else if(temp1 == 4 || temp1 == 6 || temp1 == 9 || temp1 == 11){
            if(temp2 > 0 && temp2 < 31){
                return true;
            }
        }else if(temp1 == 2) {
            if(temp % 4 == 0){
                if (temp2 > 0 && temp2 < 30) {
                    return true;
                }
            }else{
                if (temp2 > 0 && temp2 < 29) {
                    return true;
                }
            }
        }
        return false;
    }

    //验证身份证号码
    public static void yanZheng(){
        Scanner scan = new Scanner(System.in);
        long temp = qu0(scan.nextLine());
        if(temp < 100000000000000000L || temp > 999999999999999999L){
            //    410411200503020032            410411200503020032
            System.out.println("请输入正确的身份证号1");
            yanZheng();
        }else{
            String str = "" + temp;
            //判断年月日格式是否正确
            if(geShi(str)){
                System.out.println("人物信息为:");
                System.out.println("出生年月日:"
                        + qu0(str.substring(6,10)) + "年"
                        + qu0(str.substring(10,12)) + "月"
                        + qu0(str.substring(12,14)) + "日");
                //根据第十七位的奇偶性判断性别
                if((str.charAt(16) - '0') % 2 != 0){
                    System.out.println("性别为:男");
                }else{
                    System.out.println("性别为:女");
                }
            }else{
                System.out.println("请输入正确的身份证号");
                yanZheng();
            }
        }
    }

    //为年月日去除首位的0
    public static long qu0(String str){
        long temp = 0;
        for(int i = 0;i < str.length();i++){
            temp = temp * 10 + (str.charAt(i) - '0');
        }
        return temp;
    }
}
