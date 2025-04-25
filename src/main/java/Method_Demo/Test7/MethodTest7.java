//Day03
package Method_Demo.Test7;
//歌唱比赛中,六名评委给选手打分,分数范围是[0~100]之间的整数
//选手最终得分为,去掉最高分,去掉最低分后的平均分
//请完成上述过程并计算选手得分
import java.util.Random;

public class MethodTest7 {
    public static void main(String[] orgs){
        int[] defen = deFen();
        System.out.print("最终得分为" + zuiZhong(defen));
    }

    //选手最终得分
    public static int zuiZhong(int[] arr){
       int zuizhong = (zongFen(arr) - Max(arr) - Min(arr)) / 4;
       return zuizhong;
    }

    //选手最小得分
    public static int Min(int[] arr){
        int min = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > min){
                min = arr[i];
            }
        }
        return min;
    }

    //选手最大得分
    public static int Max(int[] arr){
        int max = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(arr[i] < max){
                max = arr[i];
            }
        }
        return max;
    }

    //选手总分
    public static int zongFen(int[] arr){
        int num = 0;
        for(int i = 0;i < arr.length;i++){
            num += arr[i];
        }
        return num;
    }

    //选手获得一组得分
    public static int[] deFen(){
        int[] arr = new int[6];
        for(int i = 0;i < arr.length;i++){
            arr[i] = daFen();
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    //一位评委随机打分
    public static int daFen(){
        Random random = new Random();
        int m = random.nextInt(101);
        return m;
    }

}
