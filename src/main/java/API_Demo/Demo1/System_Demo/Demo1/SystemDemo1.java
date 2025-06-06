package API_Demo.Demo1.System_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/14 15:20
 * @Day Day18
 */

//System 也是一个工具类，提供了一些与系统相关的方法

//public static void exit(int status)               终止当前运行的 Java 虚拟机
    //方法的形参:状态码:    0:表示当前虚拟机是正常停止    非0:表示当前虚拟机异常停止
//public static long currentTimeMillis()            返回当前系统的时间毫秒值形式
    //可以在程序开始和结束时分别调用,计算程序运行用时
//public static void arraycopy(数据源数组,起始索引,目的地数组，,起始索引,拷贝个数)数组拷贝
    //参数一：数据源，要拷贝的数据从哪个数组而来
    //参数二：从数据源数组中的第几个索引开始拷贝
    //参数三：目的地，我要把数据拷贝到哪个数组中
    //参数四：目的地数组的起始索引
    //参数五：拷贝元素的个数
    //注意:
        // 1.如果数据源数组和目的地数组都是基本数据类型，那么两者的类型必须保持一致，否则会报错
        //2.在拷贝的时候需要考虑数组的长度，如果超出范围也会报错
        //3.如果数据源数组和目的地数组都是引用数据类型，那么子类类型可以赋值给父类类型

//System.out.println();
    //细节：
    //System:类名
    //out:System类中的静态变量
    //System.out：获取打印的对象
    //println():方法
    //参数：表示打印的内容
public class SystemDemo1 {
}
