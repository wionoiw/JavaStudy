package Gather_Demo.Map_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/28 21:03
 * @Day Day29
 */

//Map 双列集合
//双列集合的特点
//双列集合一次需要存一对数据，分别为键和值
//键不能重复，值可以重复
//键和值是一一对应的，每一个键只能找到自己对应的值
//键+值这个整体我们称之为“键值对”或者“键值对对象”，在Java中叫做“Entry对象"

//Map   //双列集合  //接口
    //HashMap
        //LinkedHashMap
    //TreeMap

//Map的常见API
//Map是双列集合的顶层接口，它的功能是全部双列集合都可以继承使用的
//V put(K key,V value)                    //添加/覆盖元素
    //在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中,方法返回null
    //在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回
//V remove(object key)                    //根据键删除键值对元素
    //根据键删除键值对元素,会把value进行返回,没有该key返回null
//void clear()                          // 移除所有的键值对元素
//boolean containsKey(object key)       //判断集合是否包含指定的键
//boolean containsValue(object value)   //判断集合是否包含指定的值
//boolean isEmpty()                     //判断集合是否为空
    //集合为空返回true,集合不为空返回false
//int size()                            //集合的长度，也就是集合中键值对的个数
//Set<K> keySet()                       //获取集合中的所有key键,放到一个Set集合中并返回
//Set<Entry<k,y>> entrySet()            //获取集合中的所有entry对象,放到一个Set集合中并返回
    //一个entry对象是一个完整的键值对
    //Entry是Map接口的内部接口,使用时用Map.Entry调用或用import java.util.Map.Entry;导包后调用
public class MapDemo1 {
}
