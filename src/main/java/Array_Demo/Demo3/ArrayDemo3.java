//Day04
package Array_Demo.Demo3;
// 2025/03/31
// Java
//二维数组
//需求:某商城每个季度营业额如下:单位(万元)
//第一季度:22,66,44
//第二季度:77,33,88
//第三季度:25，45，65
//第四季度:11，66，99
//要求计算每个季度的总营业额和全年的总营业额
public class ArrayDemo3 {
    public static void main(String[] args){
        int[][] arr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        bianLi(arr);
    }

    //遍历二维数组,处理数据
    public static void bianLi(int[][] arr){
        //全面营业额总和
        int num1 = 0;
        for(int i = 0;i < arr.length;i++){
            //第i+1季度营业额总和
            int num2 = 0;
            for(int j = 0;j < arr[i].length;j++) {
                num2 += arr[i][j];
            }
            num1 += num2;
            System.out.println("第"+ i +"季度总营业额为"+ num2 +"元");
        }
        System.out.println("全年总营业额为"+ num1 +"元");
    }
}