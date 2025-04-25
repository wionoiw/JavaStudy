package API_Demo.Demo1.BigInteger_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/16 16:50
 * @Day Day20
 */

//BigInteger
//构造方法
//public BigInteger(int num, Random rnd)                            //获取随机大整数,范围：[θ～2的num次方-1]
//public BigInteger(String val)获取指定的大整数                        //字符串中仅能写整数,其余均会报错
//public BigInteger(String val, int radix)获取指定进制的大整数          //字符串中仅能写整数,其余均会报错,radix表示进制

//成员方法
//public static BigInteger valueOf(long val)                        //静态方法获取BigInteger的对象，内部有优化
    //细节：
    //1.能表示范围比较小,在long的取值范围之内,如果超出long的范围就会报错
    //2.在内部对常用的数字：-16～16进行了优化
        //提前把-16～16先创建好BigInteger的对象，如果多次获取不会重新创建新的。
//public BigInteger add(BigInteger val)                             //使两个BigInteger对象的值相加
//public BigInteger Subtract(BigInteger val)                        //使两个BigInteger对象的值相减
//public BigInteger multiply(BigInteger val)                        //使两个BigInteger对象的值相乘
//public BigInteger divide(BigInteger val)                          //使两个BigInteger对象的值相除，获取商
//public BigInteger[] divideAndRemainder(BigInteger val)            //使两个BigInteger对象的值相除，获取商和余数
    //数组0索引是商,1索引是余数
//public boolean equals(object x)                                   //比较BigInteger对象与另一个数值对象的值是否相同
    //比较属性值
//public BigInteger pow(int exponent)                               //获得BigInteger对象的exponent次幂

//public BigInteger max(BigInteger val)                             //比较两个BigInteger对象的值的大小,返回较大值
//public BigInteger min(BigInteger val)                             //比较两个BigInteger对象的值的大小,返回较小值
    //返回时并没有创建新对象,因为并没有改变值
//public int intValue(BigInteger val)                               //将BigInteger对象转换为整数类型,超出范围数据有误
//public long longValue(BigInteger val)                             //将BigInteger对象转换为长整数类型,超出范围数据有误
    //不会修改参与计算的BigInteger对象中的值，而是产生了一个新的BigInteger对象记录相加的值

//BigInteger对象存储的是地址值
//BigInteger对象一旦创建就不能修改
public class BigIntegerDemo1 {
}
