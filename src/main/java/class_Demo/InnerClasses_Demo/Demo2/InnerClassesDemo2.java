package class_Demo.InnerClasses_Demo.Demo2;

/**
 * @Author HHH
 * @Date 2025/4/9 19:34
 * @Day Day13
 */

//成员内部类
//  写在成员位置的,属于外部类的成员(类中方法外)
//  成员内部类可以被一些修饰符所修饰，比如：private，默认，protected，public，static等
//  在成员内部类里面，JDK16之前不能定义静态变量，JDK16开始才可以定义静态变量

//获取成员内部类对象
//方式一:当成员内部类被private修饰时
//  在外部类中编写方法，对外提供内部类的对象
//方法二:当成员内部类被非私有修饰时，直接创建对象。
//  格式: 外部类名.内部类名 对象名=外部类对象.内部类对象;
//  Outer.lnner oi = new Outer().new Inner();

//外部类成员变量和内部类成员变量重名时，在内部类如何访问？
//Outer.this获取了外部类对象的地址值
//System.out.println(outer.this.变量名);
public class InnerClassesDemo2 {
}
