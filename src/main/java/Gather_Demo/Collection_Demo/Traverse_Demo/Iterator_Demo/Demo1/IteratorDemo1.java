package Gather_Demo.Collection_Demo.Traverse_Demo.Iterator_Demo.Demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author HHH
 * @Date 2025/4/22 16:40
 * @Day Day26
 */

//Iterator 迭代器

//迭代器遍历
//迭代器在Java中的类是Iterator，迭代器是集合专用的遍历方式。

//Collection集合获取迭代器,用集合对象调用
//Iterator<E> iterator()                        //返回迭代器对象，默认指向当前集合的0索引

//Iterator中的常用方法
//boolean hasNext()                             //判断当前位置是否有元素，有元素返回true,没有元素返回false
//E next()                                      //获取当前位置的元素，并将迭代器对象移向下一个位置
//void remove()                                 //从迭代器指向的collection中移除选代器返回的最后一个元素(可选操作)

//迭代器的注意点
//当指针指向null时,运行next方法会报错NoSuchElementException(没有这个元素)
//迭代器遍历完毕，指针不会复位
//循环中只能用一次next方法
//迭代器遍历时，不能用集合的方法进行增加或者删除,如果一定要删除,可以使用Iterator中的remove()方法删除,但没有办法添加
//如果我们要继续第二次遍历集合,只能再次获取一个新的迭代器对象
public class IteratorDemo1 {
    public static void main(String[] args) {
        //创建集合并添加元素
        Collection<String> coll =new ArrayList<String>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //获取迭代器对象
        //迭代器就好比是一个箭头，默认指向集合的0索引处
        Iterator<String> it = coll.iterator();

        //利用循环不断的去获取集合中的每一个元素
        //当it.hasNest()返回false,即指针指向null时,代表集合遍历完毕,结束循环
        while (it.hasNext()){
            //next方法的两件事情,获取元素并移动指针
            System.out.println(it.next());
        }
    }
}
