//Day03
package Array_Demo.Test4;
//需求:定义一个数组,存入1~5,
//要求打乱数组中所有数据的顺序
import java.util.Random;

public class ArrayTest4 {
    public static void main(String[] orgs){
        int[] arr = {1,2,3,4,5};
        Random random = new Random();
        //循环打乱顺序
        for(int i = 0;i < arr.length;i++){
            int temp = arr[i];
            int ran = random.nextInt(arr.length);
            arr[i] = arr[ran];
            arr[ran] = temp;
        }
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
