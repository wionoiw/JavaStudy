//Day03
package Method_Demo.Test1;
//需求: 设计一个方法用于数组遍历,要求遍历的结果是在一行上的
//例如: [11,22,33,44,55]
public class MethodTest1 {
    public static void main(String[] orgs){
        int[] arr ={11,22,33,44,55};
        BianLi(arr);
    }

    //定义一个方法用于数组遍历
    public static void BianLi(int[] arr){
        System.out.print("[");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]);
            if(i != arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
