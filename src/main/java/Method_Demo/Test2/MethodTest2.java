//Day03
package Method_Demo.Test2;
//定义一个方法,判断数组中的某个数是否存在,将结果返回给调用处

import java.util.Scanner;

public class MethodTest2 {
    public static void main(String[] orgs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数:");
        int num = scanner.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.print(PanDuan(arr,num));
    }

    public static boolean PanDuan(int[] arr,int num){
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
