package API_Demo.Demo1.Packaging_Demo.Integer_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/19 16:23
 * @Day Day23
 */

//各包装类基本类似,以Integer为例

//获取Integer对象的方式(JDK5以前,已淘汰)
//public Integer(int value)                             //根据传递的整数创建一个lnteger对象
//public Integer(String s)                              //根据传递的字符串创建一个Integer对象
//public static Integer valueOf(int i)                  //根据传递的整数创建一个Integer对象
//public static Integer valueOf(String s)               //根据传递的字符串创建一个Integer对象
//public static Integer valueOf(String s, int radix)    //根据传递的字符串和进制创建一个Integer对象


//需求:创建两个Integer类型数据1,2进行相加得到结果3(注意:对象之间是不能直接进行计算的)

//在JDK5以前包装类如何进行计算
//步骤:
//1.把对象进行拆箱，变成基本数据类型
//2.相加
//3.把得到的结果再次进行装箱(再变回包装类)
//Integer i1 = new Integer(1);
//Integer i2 = new Integer(2);
//int result =i1.intValue()+i2.intValue();
//Integer i3 =new Integer(result);
//System.out.println(i3);

//在JDK5的时候提出了一个机制:自动装箱和自动拆箱
//自动装箱:把基本数据类型会自动的变成其对应的包装类
//自动拆箱:把包装类自动的变成其对象的基本数据类型
//Integer i1 = 10;       //在底层，此时还会去自动调用静态方法valueOf得到一个Integer对象,只不过这个动作不需要我们自己去操作了
//Integer i2 = new Integer(value:10);
//int i3 = i2;           //自动拆箱的动作
//在JDk5以后，int和Integer可以看做是同一个东西，因为在内部可以自动转化。
public class IntegerDemo1 {
    public static void main(String[] args){
        //JDK5及以后Integer类计算的方式
        Integer i1 = 1;
        Integer i2 = 2;
        Integer i3 = i1 + i2;
        System.out.println(i3);
    }
}
