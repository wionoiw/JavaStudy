package Gather_Demo.Collection_Demo.Set_Demo.HashSet_Demo.LinkedHashSet_Demo;

/**
 * @Author HHH
 * @Date 2025/4/23 18:04
 * @Day Day27
 */

//LinkedHashSet
//Linked    链表,表明LinkedListSet底层数据结构是链表
//HashSet    表明LinkedHashSet是HashSet的子类

//LinkedHashSet底层原理
//有序、不重复、无索引
//这里的有序指的是保证存储和取出的元素顺序一致
//原理:底层数据结构是依然哈希表只是每个元素又额外的多了一个双链表的机制记录存储的顺序
//添加的第一个元素为双向链表的头结点,其后每添加一个元素都与上一个元素相连

//在以后如果要数据去重，我们使用哪个?
//默认使用HashSet
//如果要求去重且存取有序，才使用LinkedHashSet
//在底层HashSet效率更高

//LinkedHashSet继承于HashSet并无额外新增方法
public class LinkedHashSetDemo1 {
}
