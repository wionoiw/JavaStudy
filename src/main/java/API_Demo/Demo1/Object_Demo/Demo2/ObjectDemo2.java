package API_Demo.Demo1.Object_Demo.Demo2;

/**
 * @Author HHH
 * @Date 2025/4/16 16:36
 * @Day Day19
 */
//Objects   是一个工具类，提供了一些方法去完成一些功能

//public static boolean equals(object a,Object b)           先做非空判断,再比较两个对象
    //细节：
    //1.方法的底层会判断s1是否为null，如果为null，直接返回false
    //2.如果s1不为null，那么就利用s1再次调用equals方法
    //3.此时s1是Student类型，所以最终还是会调用student中的equals方法
    //如果没有重写，比较地址值，如果重写了，就比较属性值
//public static boolean isNull(object obj)                  判断对象是否为null,为null返回true,反之
//public static boolean nonNull(object obj)                 判断对象是否为null,跟isNull的结果相反
public class ObjectDemo2 {
}
