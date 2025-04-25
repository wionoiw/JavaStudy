package extends_Demo.Demo3;

/**
 * @Author HHH
 * @Date 2025/4/7 16:44
 * @Day Day11
 */

//虚方法表:非private,非static,非final
//方法重写的本质:子类覆盖了从父类当中继承下来的虚方法表里面的方法

//方法重写的注意事项和要求
//  1.重写方法的名称,形参列表必须和父类中的一致
//  2.子类重写父类方法时,访问权限必须大于等于父类(默认<protected<public)
//  3.子类重写父类方法时,返回值类型子类必须小于等于父类
//  4.建议:重写的方法尽量和父类保持一致
//  5.只有被添加到虚方法表里的方法才能被重写

//方法的重写
//  当父类的方法不能满足子类现在的需求时,需要进行方法重写;

//书写格式
//  在继承体系中,子类出现了和父类中一模一样的方法声明,我们就称子类这个方法是重写的方法

//@Override重写注解
//  1.@Override是放在重写后的方法上,校验子类重写时语法是否正确
//  2.加上注解后如果有红色波浪线.表示语法错误
//  3.建议重写方法都加@Override注解,代码安全,优雅
public class extendsDemo3 {
    public static void main (String[] args){
        Student stu = new Student();
        stu.eat();
        stu.drink();
    }
}
