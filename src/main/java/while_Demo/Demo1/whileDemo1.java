//Day02
package while_Demo.Demo1;

//while循环
//while(判断条件){
//  循环体语句;
// }

//需求:世界最高山峰珠穆朗玛峰(8844.43米=8844430毫米),假如有一张足够大的纸,
//厚度是0.1毫米,请问折多少次可以折成珠穆朗玛峰的厚度。

public class whileDemo1 {
    public static void main(String[] args){
        //定义一个变量a记录折纸次数
        int a = 0;
        //定义一个变量记录纸张厚度
        double b = 0.1;
        while(b <= 8844430.0){
            //每折一次纸张厚度翻倍
            a++;
            b *= 2;
        }
        System.out.println("需要折" + a + "次");
    }
}