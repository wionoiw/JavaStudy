//Day06
package API_Demo.Demo1.String_Demo.Test4;
//发票金额转换
//需求输入金额(如523)转换为汉字大写(人民币零佰零拾零万零仟伍佰贰拾叁元)
import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入金额");
        double num = scan.nextDouble();
        System.out.println(zhuanHuan(num));
    }

    //转换大小写
    public static String zhuanHuan(double num){
        //记录最终字符串
        String Str = "";
        //将小数点后提到个位方便取余
        num *= 100;
        //判断输入的数是否在0~9999999.99之间
        if(num > 999999999 || num < 0){
            Str = "金额无效,请输入在0~9999999(一千万)区间内的值";
        }else{
            String[] arr1 = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
            String[] arr2 = {"分","角","元","拾","佰","仟","万","拾","佰"};
            String str = "";
            for(int i = 0;i < 9;i++){
                double temp = num % 10 ;
                num /= 10;
                //倒序将字符串记录
                str += arr2[i] += arr1[(int)temp];
            }
            //反转字符串
            for(int i = 0; i < str.length() ;i++){
                Str += str.charAt(str.length() - 1 -i);
            }
        }
        return Str;
    }

}
