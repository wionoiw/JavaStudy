package API_Demo.Demo1.BigDecimal_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/16 23:10
 * @Day Day20
 */

//BigDecimal
//用于小数的精确计算
//用来表示很大的小数

//构造方法获取BigDecimal对象
    //public BigDecimal(double val)                                 //此构造方法的结果有一定的不可预知性
        //因为例如0.1存储进double中时,会因为超出double小数部分的52位导致数据失真,导致结果不精确
    //public BigDecimal(String val)                                 //此构造方法的结果不具有不可预知性
//静态方法获取BigDecimal对象
    //public static BigDecimal valueOf(double val)
//细节：
//1.如果要表示的数字不大，没有超出double的取值范围，建议使用静态方法
//2.如果要表示的数字比较大，超出了double的取值范围，建议使用构造方法
//3.如果我们传递的是0~10之间的整数，包含0,包含10,那么方法会返回已经创建好的对象，不会重新new

//常用成员方法
//public static BigDecimal valueOf(double val)获取对象
//public BigDecimal add(BigDecimal val)                              //使两个BigDecimal对象的值相加
//public BigDecimal subtract(BigDecimal val)                         //使两个BigDecimal对象的值相减
//public BigDecimal multiply(BigDecimal val)                         //使两个BigDecimal对象的值相乘
//public BigDecimal divide(BBgDecimal val)                           //使两个BigDecimal对象的值相除，获取商
    //如果除不尽的话,会报错,需要用下边的divide()重载方法
//public BigDecimal divide(BigDecimal val,米精确几位,舍入模式)除法        //使两个BigDecimal对象的值相除，获取商
    //精确位数直接用int类型的正整数表示
    //舍入模式需要用另一个类RoundingMode中的静态常量,不同的常量代表不同的舍入模式(默认用HALF_UP,四舍五入)
public class BigDecimalDemo1 {
}
