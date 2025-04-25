package Generics_Demo.Demo2;

/**
 * @Author HHH
 * @Date 2025/4/23 15:37
 * @Day Day27
 */

//泛型类
//当一个类中，某个变量的数据类型不确定时，就可以定义带有泛型的类
//格式:
    //修饰符 class 类名<类型>{
    //
    //}
//举例:
    //public class ArrayList<E> {       //此处E可以理解为变量,但是不是用来记录数据的,而是记录数据的类型,可以写成:T、E、K、V等
    //                                  //泛型常用的四个字母是其对应单词的缩写T(type),E(element),K(key),V(value)
    //}

//泛型方法
//方法中形参类型不确定时,可以使用类名后面定义的泛型<E>,
//也可以在方法申明上定义自己的泛型<E>     //方法上定义的泛型仅有本方法能用
//格式:
    //修饰符 <类型> 返回值类型 方法名(类型 变量名){   //将<类型>写在返回值类型前
    //
    //}
//举例:
    //public <T> void show(T t) {       //此处T可以理解为变量,但是不是用来记录数据的,而是记录数据的类型,可以写成:T、E、K、V等
    //
    //}

//泛型接口
//接口中形参类型不确定时,在接口名后定义自己的泛型<E>
//格式:
    //修饰符 interface 接口名<类型>{
    //
    //}
//举例:
    //public interface List<E> {       //此处E可以理解为变量,但是不是用来记录数据的,而是记录数据的类型,可以写成:T、E、K、V等
    //                                  //泛型常用的四个字母是其对应单词的缩写T(type),E(element),K(key),V(value)
    //}
//如何使用一个带泛型的接口
    //方法1.实现类给出具体类型
        //public class MyArrayList2 implements List<String>{}
    //方法2.实现类延续泛型，创建对象时再确定
        //第一个E是让实例化对象传入的泛型,第二个E是传给List接口泛型的类型
        //public class MyArrayList3<E> implements List<E>{}
public class GenericsDemo2 {
}
