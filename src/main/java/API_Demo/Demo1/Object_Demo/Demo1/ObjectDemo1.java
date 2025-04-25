package API_Demo.Demo1.Object_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/15 15:10
 * @Day Day19
 */

//Object
    //Object是Java中的顶级父类。所有的类都直接或间接的继承于Object类。
    //Object类中的方法可以被所有子类访问,所以我们要学习Object类和其中的方法。

//Object的构造方法(仅有空参构造)
//方法名说明
//public Object()                       空参构造

//Object类的成员方法
//public String toString()返回对象的字符串表示形式
    //对象的字符串表现形式:包名.类名@地址值      例:java.lang.Object@119d7047
    //可以进行重写
    //System.out.println();其实是调用其中对象的toString()方法,并将其打印出来
//public boolean equals(object obj)比较两个对象是否相等
    //未重写的equals方法,默认调用Object中的equals方法比较两对象的地址值
    //重写的equals方法,比较各属性值
//protected object clone(int a)对象克隆
    //clone()是由protected修饰的,所以仅能在其本包或不同包的子类中调用,若不同包的子类的实例化对象需要调用,只能重写clone()方法
    //如果一个类中重写了clone()方法,则需要调用cloneable接口
    //cloneable 接口
    //如果一个接口里面没有抽象方法
    //表示当前的接口是一个标记性接口
    //现在cloneable表示一旦了实现，那么当前类的对象就可以被克隆
    //如果没有实现，当前类的对象就不能克隆
        //clone()方法在底层会帮我们创建一个对象，并把原对象中的数据拷贝过去。
        //书写细节：
        //1.重写object中的clone方法
        //2.让javabean类实现cloneable接口
        //3.创建原对象并调用clone就可以了
    //对象克隆
    //把A对象的属性值完全拷贝给B对象，也叫对象拷贝，对象复制
    //浅克隆会将基本数据类型的属性的值拷贝过来,字符串复用,引用数据类型属性会拷贝原对象属性的地址值
        //Object类中的克隆clone()类是浅克隆
    //深克隆会将基本数据类型的属性的值拷贝过来,字符串复用,引用数据类型元素会重新创建并拷贝其中的数据值
        //一,深克隆可以通过重写clone()来实现
        //二,深克隆可以通过导入第三方工具来实现(gson包)
public class ObjectDemo1 {
}
