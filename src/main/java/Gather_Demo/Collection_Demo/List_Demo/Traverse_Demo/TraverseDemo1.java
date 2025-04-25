package Gather_Demo.Collection_Demo.List_Demo.Traverse_Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author HHH
 * @Date 2025/4/22 18:11
 * @Day Day26
 */

//List集合的遍历方式
    //Collection接口实现类通用遍历
        //迭代器遍历
        //增强for遍历
        //Lambda表达式遍历

    //List实现类独有遍历
        //普通for循环(因为List集合存在索引)
        //列表迭代器遍历
            //列表迭代器 ListIterator 接口 是Iterator的子接口

//五种遍历方式对比
    //在遍历的过程中需要删除元素
        //迭代器遍历
        //列表迭代器遍历
    //在遍历的过程中需要添加元素
        //列表迭代器遍历
    //仅仅想遍历
        //增强for遍历
        //Lambda表达式遍历
    //如果遍历的时候想操作索引
        //普通for遍历

public class TraverseDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //迭代器遍历
        System.out.println("\n迭代器遍历");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }

        //增强for循环遍历
        System.out.println("\n增强for循环遍历");
        for(String s : list){
            System.out.print(s + " ");
        }

        //Lambda表达式遍历
        System.out.println("\nLambda表达式遍历");
        list.forEach(s -> System.out.print(s + " "));

        //普通for循环遍历
        System.out.println("\n普通for循环遍历");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
