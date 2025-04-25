//Day03
package Method_Demo.Test12;
//需求:模拟双色球
//投注号码由六个红色球号码和1个蓝色球号码组成,
//红色球号码从1~33中选择,蓝色球号码从1~16中选择
//用户输入自己的号码,与随机生成的号码进行对比，判断中了几等奖
import java.util.Random;
import java.util.Scanner;

public class MethodTest12 {
    public static void main(String[] orgs){
        int[] arr = Jiang();
        int[] user = Set();
        DuiJiang(user,arr);
    }

    //用户键入用户号码
    public static int[] Set(){
        int[] arr = new int[7];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请依次输入你的六个红色球号码,最后输入蓝色球号码");
        for(int i = 0;i < arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    //兑奖
    public static void DuiJiang(int[] user,int[] arr){
        //打印中奖号码
        DaYin(arr);
        //打印用户号码
        DaYin(user);
        //蓝球中奖个数
        int m = blue(user,arr);
        //红球中奖个数
        int n = red(user,arr);
        if(m == 1 & n == 6){
            System.out.println("您中了一等奖");
        }else if( m == 0 && n == 6){
            System.out.println("您中了二等奖");
        }else if( m == 1 && n == 5){
            System.out.println("您中了三等奖");
        }else if(( m == 0 && n == 5) ||( m == 1 && n == 4)){
            System.out.println("您中了四等奖");
        }else if(( m == 0 && n == 4) || ( m == 1 && n == 3)){
            System.out.println("您中了五等奖");
        }else if(( m == 1 && n == 2) || ( m == 1 && n == 1) || ( m == 1 && n == 0)){
            System.out.println("您中了六等奖");
        }else{
            System.out.println("很遗憾,您没有中奖");
        }
    }

    //打印号码
    public static void DaYin(int[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //对比蓝球
    public static int blue(int[] user,int[] arr){
        //蓝球中奖的个数
        int a = 0;
        if(user[user.length-1] == arr[arr.length-1]){
            a++;
        }
        return a;
    }

    //对比红球
    public static int red(int[] user,int[] arr){
        //红球中奖的个数
        int a = 0;
        for(int m = 0;m < user.length-1;m++){
            for(int n = 0;n < arr.length-1;n++){
                if(user[m] == arr[n]){
                    a++;
                arr[n] = 0;
                break;
                }
            }
        }
        return a;
    }

    //随机生成中奖号码
    public static int[] Jiang(){
        Random ran = new Random();
        int[] arr = new int[7];
        for(int i = 0;i < 7;i++){
            if(i == 6){
                arr[i] = ran.nextInt(16) + 1;
            }else{
                arr[i] = ran.nextInt(33) + 1;
            }
        }
        return arr;
    }
}



