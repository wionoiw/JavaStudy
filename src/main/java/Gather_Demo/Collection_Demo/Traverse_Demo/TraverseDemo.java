package Gather_Demo.Collection_Demo.Traverse_Demo;

/**
 * @Author HHH
 * @Date 2025/4/22 16:29
 * @Day Day26
 */

//Traverse 遍历

//Collection的遍历方式       //普通for循环遍历数组只有List系列集合可以用,Set集合没有索引,不能使用
    //迭代器遍历
        //通过创建迭代器对象,对集合进行遍历
        //迭代器在java中的类是Iterator，迭代器是集合专用的遍历方式

    //增强for遍历
        //增强for的底层就是一个迭代器,为了简化迭代器的代码书写
        //增强for遍历是在JDK5以后出现的,其内部原理就是一个Iterator迭代器
        //所有的单列集合和数组才能用增强for进行遍历
        //写法for(元素的数据类型 变量名 :数组或集合){}
            //例:for(String s : list){       //s其实是一个第三方变量,在循环过程中依次表示集合中的每个元素
            //      System.ou.println(s);
            //  }
        //修改增强for中的变量s,不会改变集合中原本的数据

    //Lambda表达式遍历
        //得益于JDK8开始的新技术Lambda表达式，提供了一种更简单、更直接的遍历集合的方式
        //Collection的成员方法
        //default void forEach(Consumer<? super T> action)              //结合lambda遍历集合  //Consumer是一个函数式接口

        //匿名内部类的方式,s依次表示集合中的每个元素,并对s进行代码块的处理
        //coll.forEach(new Consumer<String>(）{
        //@Override
        //public void accept(String s）{
        //System.out.println(s);
        //})；

        //lambda表达式
        //coll.forEach(s -> System.out.println(s));

//三种通用遍历方式的使用场景
//在遍历的过程中需要删除元素,使用迭代器
//增强for、Lambda:
//仅仅想遍历，那么使用增强for或Lambda表达式
public class TraverseDemo {
}
