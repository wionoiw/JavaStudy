package Gather_Demo.Collection_Demo.Demo2;

/**
 * @Author HHH
 * @Date 2025/4/24 23:56
 * @Day Day28
 */

//单列集合各类使用场景
//1.如果想要集合中的元素可重复
    //用ArrayList集合,基于数组的(用的最多)
//2.如果想要集合中的元素可重复,而且当前的增删操作明显多于查询
    //用LinkedList集合,基于链表的
//3.如果想对集合中的元素素去重
    //用HashSet集合,基于哈希表的(用的最多)
//4.如果想对集合中的元素去重,而且保证存取顺序
    //用LinkedHashSet集合,基于哈希表和双链表,效率低于HashSet
//5.如果想对集合中的元素进行排序
    //TreeSet集合,基于红黑树后续也可以用List集合实现排序
public class CollectionDemo2 {
}
