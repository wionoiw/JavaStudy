//Day03
package Method_Demo.Test11;
//需求:模拟抽奖有{2,588,888,1000,10000}五个奖金。
//模拟抽奖打印出每个奖项,奖项的出现顺序随机且不重复
import java.util.Random;

public class MethodTest11 {
    public static void main(String[] orgs){
        int[] arr = {2,588,888,1000,10000};
        ChouJiang(arr);
    }

    //单次抽奖验证
    public static void ChouJiang(int[] arr){
        Random random = new Random();
        //记录抽出的奖项
        int[] arr2 = new int[arr.length];
        arr2[0] = 1;
        //记录抽出奖项的次数
        int i = 0;
        //无限循环抽取
        while(true){
            //循环结束条件,抽出五个奖
            if(i == arr.length){
                break;
            }
            //随机抽取
            int temp = random.nextInt(arr.length);
            //与抽出的奖项进行对比
            if(arr2[temp] != temp){
                System.out.println(arr[temp] + "元的奖金被抽出");
                //记录抽出的奖项
                arr2[temp] = temp;
                //抽出奖项的次数加1
                i++;
            }
        }
    }
}
