package class_Demo.Demo4;

/**
 * @Author HHH
 * @Date 2025/4/9 11:45
 * @Day Day13
 */

//权限修饰符
//  权限修饰符:用来控制一个成员能够被访问的范围
//  可以修饰成员变量,方法,构造方法,内部类

//权限修饰符的分类
//  作用范围由小到大(private < 空着不写(缺省/默认) < protected < public)

//修饰符       同一个类中   同一个包中的其他类   不同包下的子类     不同包下的无关类
//private        O            X                X                X
//空着不写         O            O                X                X
//protected      O            O                O                X
//public         O            O                O                O

//权限修饰符的使用规则
//  实际开发中,一般只用private和public
//  成员变量私有
//  方法公开
//      如果方法中的代码是抽取其他方法中的共性代码,这个方法一般也私有
public class classDemo4 {
}
