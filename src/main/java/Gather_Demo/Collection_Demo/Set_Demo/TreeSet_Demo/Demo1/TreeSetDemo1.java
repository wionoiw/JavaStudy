package Gather_Demo.Collection_Demo.Set_Demo.TreeSet_Demo.Demo1;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Author HHH
 * @Date 2025/4/23 18:01
 * @Day Day27
 */

//TreeSet
//Tree     树,表明Tree底层数据结构是树
//Set      表明TreeSet是Set系列的一员

//TreeSet的特点
    //不重复、无索引、可排序
    //可排序:按照元素的默认规则(由小到大)排序
    //TreeSet集合底层是基于红黑树的数据结构实现排序的,增删改查性能都较好

//TreeSet集合默认的规则
    //对于数值类型：Integer,Double,默认按照从小到大的顺序进行排序
    //对于字符、字符串类型:按照字符在ASCII码表中的数字升序进行排序

//TreeSet的两种比较方式
//使用原则:默认使用第一种,如果第一种不能满足当前需求,就使用第二种
//优先级:当两种排序方法同时存在时,优先使用第二种
//方式一：
    //默认排序/自然排序:
        //自定义类实现comparable函数式按口,重写里面的抽象方法,再指定比较规则
        //comparable接口中仅有一个抽象方法,返回值为int
        //调用者为将要添加进红黑树中的元素,传入抽象方法中的参数为要和调用者比较的红黑树中的节点
        //返回值为负,存入节点左侧;返回值为正,存入节点右侧;返回值为零,证明已有该元素,舍弃该元素,不再添加
//方式二:
    //比较器排序:创建TreeSet对象时候,传递比较器Comparator指定规则
        //Comparator是函数式接口,重写里面的抽象方法,再指定比较规则
        //Comparator接口中仅有一个抽象方法,返回值为int
        //调用者为将要添加进红黑树中的元素,传入抽象方法中的参数为要和调用者比较的红黑树中的节点
        //返回值为负,存入节点左侧;返回值为正,存入节点右侧;返回值为零,证明已有该元素,舍弃该元素,不再添加
public class TreeSetDemo1 {
}
