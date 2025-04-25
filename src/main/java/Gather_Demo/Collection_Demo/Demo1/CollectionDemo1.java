package Gather_Demo.Collection_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/22 16:04
 * @Day Day26
 */

//Collection是单列集合的祖宗接口,它的功能是全部单列集合都可以继承使用的

//常用方法
//public boolean add(E e)                                   //把给定的对象添加到当前集合中
    //如果往List系列集合中添加数据,那么方法永远返回true,因为List系列的是允许元素重复的
    //如果往Set系列集合中添加数据,若当前要添加元素不存在,方法返回true,表示添加成功
    //若当前要添加的元素已经存在,方法返回false,表示添加失败,因为Set系列的集合不允许重复
//public void clear()                                       //清空集合中所有的元素
//public boolean remove(E e)                                //把给定的对象在当前集合中删除
    //因为collection里面定义的是共性的方法,所以此时不能通过索引进行删除。只能通过元素的对象进行删除
    //方法会有一个布尔类型的返回值,删除成功返回true,删除失败返回false
    //如果要删除的元素不存在,就会删除失败
//public boolean contains(object obj)                       //判断当前集合中是否包含给定的对象
    //底层是依赖equals方法进行判断是否存在的
    //如果集合中存储的是自定义对象,想通过contains方法来判断是否包含,那么在javabean类中,一定要重写equals方法。
//public boolean isEmpty()                                  //判断当前集合是否为空
//public int size()                                         //返回集合中元素的个数/集合的长度
public class CollectionDemo1 {
}
