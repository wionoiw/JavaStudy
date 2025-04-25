//Day10
package class_Demo.Test3;
//需求:
//  请按照如下要求编写一个数组的工具类:ArrayUtil
//  提供一个工具类方法printArr,用于返回整数数组的内容
//      返回的字符串格式如:[10,20,50,34,100](只考虑整数数组,且只考虑一维数组)
//  提供一个工具类方法getAerage,用于返回平均分(只考虑浮点型数组,且只考虑一维数组)
//  定义一个测试类,调用该工具类的工具方法,并返回结果
public class classTest3 {
    public static void main(String[] args){
        //测试工具类方法printArr
        int[] intArr = {1,2,3,4,5,6,7,8,9};
        ArrayUtil.printArr(intArr);

        //测试工具类方法getAerage
        double[] douArr = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        double temp = ArrayUtil.getAverage(douArr);
        System.out.println(temp);
    }
}
