package Algorithm_Demo.Search_Demo.BasicSearch_Demo.Test1;

import java.util.ArrayList;

/**
 * @Author HHH
 * @Date 2025/4/19 21:29
 * @Day Day23
 */


public class BasicSearchTest1 {
    public static void main(String[] args) {
        int[] arr = {131,127,147,81,103,23,7,79,81};
        System.out.println(basicSearch2(arr,81));
    }

    //需求1：定义一个方法利用基本查找，查询某个元素在数组中的索引
    //要求：不需要考虑数组中元素是否重复
    public static int basicSearch1(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    //需求2：定义一个方法利用基本查找，查询某个元素在数组中的索引
    //要求：需要考虑数组中元素是否重复
    public static ArrayList<Integer> basicSearch2(int[] arr, int num){

        //创建集合,记录所有符合条件元素的索引
       ArrayList<Integer> list = new ArrayList<Integer>();

        //将符合条件的索引依次添加进Arr中
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                list.add(i);
            }
        }

        return list;
    }

}
