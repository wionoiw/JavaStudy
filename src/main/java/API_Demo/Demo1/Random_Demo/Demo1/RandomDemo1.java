//Day02
package API_Demo.Demo1.Random_Demo.Demo1;

//需求:生成一个1~100之间的随机数,进行猜数游戏
//导包,Random类
import java.util.Random;
import java.util.Scanner;

public class RandomDemo1 {
    public static void main(String[] orgs){
        //创建Random对象
        Random random = new Random();
        //生成随机数,括号内选定范围
        //范围为0~括号内数字减1

        //生成任意数到任意数之间的随机数   例如:7~15
        //使头尾减去同一个值,使范围从零开始     7-7~15-7既0~8
        //尾巴加1       0~8+1既0~9
        //最终的结果加上第一步减去的值    int num = random.nextInt(9) + 7;
        int num = random.nextInt(100) + 1;
        System.out.println("随机数已生成完成,请输入你猜测的数");
        Scanner scanner = new Scanner(System.in);
        while(true){
            //定义变量a来接收猜测的数
            int a = scanner.nextInt();
            if(a < num){
                System.out.println("输入的数太小了,请重新输入");
                continue;
            }else if(a > num){
                System.out.println("输入的数太大了,请重新输入");
                continue;
            }else{
                System.out.println("你答对了,这个数就是"+num);
                break;
            }
        }


    }
}
