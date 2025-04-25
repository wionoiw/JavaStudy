package main_Demo.Demo1;
//JVM java虚拟机
public class mainDemo1 {
    //public        main方法被虚拟机调用,访问权限需要足够大
    //static        被JVM调用,不用创建对象,直接访问      因为main方法是静态的,所以测试类中其他方法也需要是静态的
    //void          被JVM调用,不需要给JVM返回值
    //main          一个通用的名字,虽然不是关键字,但是只有main被JVM识别
    //String[] args 在以前用于接受键盘传入的参数,现在为了向下兼容,Java对此作了保留
    public static void main(String[] args){
        System.out.print("Hello world");
    }
}
