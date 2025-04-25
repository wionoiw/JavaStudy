//Day03
package Method_Demo.Test3;
//需求:定义一个方法copyOfRange(int[] arr,int from,int to)
//功能:将数组arr中从索引from(包含from)开始,
//到索引to(不包含to)结束的元素复制到新数组中

public class MethodTest3 {
    public static void main(String[] orgs){
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int[] arr3 = copyOfRange(arr,2,8);
        daYin(arr3);
    }
    public static int[] copyOfRange(int[] arr,int from,int to){
        //定义arr2为copy后的新数组
        int[] arr2 = new int[to-from];
        for(int i = 0;i < arr2.length;i++){
            arr2[i] = arr[from + i];
        }
        return arr2;
    }
    public static void daYin(int[] arr){
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

