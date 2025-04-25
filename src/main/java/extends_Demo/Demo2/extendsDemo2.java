package extends_Demo.Demo2;

/**
 * @Author HHH
 * @Date 2025/4/6 23:37
 * @Day Day10
 */

//继承的特点
//  Java只支持单继承,不支持多继承,但支持多层继承
//  子类直接继承的叫做直接父类,多层继承的叫做间接父类
//  子类仅能访问父类中非私有的成员

//子类能继承父类中的那些内容
//  构造方法    非私有(不能继承)   pivate(不能继承)
//  成员变量    非私有(能继承)    pivate(能继承)
//  成员变量    非私有(能继承)    pivate(不能继承)

//每一个类都直接或者间接的继承于Object(没有指定父类,编译器默认继承Object)

//super关键字
//和this关键字用法类似,在成员函数中代表父类   例如: super.属性值代表调用父类属性代表
//在子类中最多调用1次super方法,不能super.super.属性值

//虚方法表:非private,非static,非final
public class extendsDemo2 {
    public static void main(String[] args){
        Zi zi = new Zi();
        zi.show();
    }
}