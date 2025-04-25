//Day07
package API_Demo.Demo1.StringBuilder_Demo.Demo1;
//String replace(旧值,新值);
//返回值是调换后的结果,不会修改原字符串

//StringBuilder类 :   提高字符串操作效率
//StringBuilder可以看成是一个容器,创建之后里边的内容是可变的

//StringBuilder构造方法
//public StringBuilder(); 创建一个空白可变字符串对象,不含有任何内容
//public StringBuilder(String str); 根据字符串内容,来创建可变字符串对象
//StringBUilder sb = new StringBuilder("abc");

//StringBuilder常用方法
//public StringBuilder append(任意类型); 添加数据,并返回对象本身
//public StringBuilder reverse();   反转容器中的内容(直接修改sb对象)
//public int length();          返回长度(字符出现的个数,StringBuilder对象中当前存储多少字符)
//public int capacity();         返回容量(StringBuilder对象中最多存储多少字符)
//public String toString();     通过toString()就可以实现把StringBuilder转换为String

//StringBuilder的应用场景
//1.字符串的拼接
//2.字符串的反转

//需求:对称字符串
//键盘接受一个字符串,程序判断该字符串是否是对称字符串
import java.util.Scanner;

public class StringBuilderDemo1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = new StringBuilder(scan.nextLine()).toString();
//        String Str = new StringBuilder(str).reverse().toString();
//        System.out.println(str == Str);
        System.out.println(str == new StringBuilder(str).reverse().toString());
    }
}
