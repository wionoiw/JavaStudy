//Day08
package Gather_Demo.Collection_Demo.List_Demo.ArrayList_Demo.Demo2;
//基本数据类型对应的包装类
//byte  Byte
//shhort    Short
//char  Character
//int   Integer
//long  Long
//float Float
//double    Double
//boolean   Boolean
import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args){
        //创建存储基本数据类型的集合时,泛型内填写基本数据类型对应的包装类
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.print(list);
    }
}
