//Day05
package API_Demo.Demo1.String_Demo.Demo1;
//String代表字符串
//字符串的内容是不会发生改变的,它的对象在创建后不能被更改
//Strin是java定义好的一个类.定义在java.lang包中,所以使用的时候不需要导包

//创建String对象的两种方法
//方法1:直接赋值
// String name == " 张三 ";
//方法2:new(构造方法)
//public String(); 创建一个空字符串,不含任何内容
//public String(String original); 根据传入的字符串,创建字符串对象
//public String(char[] chs); 根据字符数组,创建字符串对象

//public String(byte[] chs); 根据字节数组,创建字符串对象  //字符串内实际添加的是byte类型对应ASCII码表的内容
//例如: byte[] chs = {97,98,99,100};
//System.out.print(String(chs));
//控制台输出abcd

//==号的比较
//基本数据类型比较数据值
//引用数据类型比较地址值

//字符串的比较
//equals(要比较的字符串); 完全一样返回true,否则返回false
//equalslgnoreCase(要比较的字符串); 忽略大小写的比较

public class StringDemo1 {
}
