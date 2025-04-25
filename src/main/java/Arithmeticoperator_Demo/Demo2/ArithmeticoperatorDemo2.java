//Day02
package Arithmeticoperator_Demo.Demo2;
//赋值运算符和关系运算符
// += -= *= /= %=
//关系运算符 == 判断两边是否相等 != 判断两边是否不等

public class ArithmeticoperatorDemo2 {
    public static void  main(String[] args){
        //定义变量a,b
        int a = 10;
        int b = 4;
        //+= 将a和b相加后的值赋值给a
        System.out.println( a += b );
        //-= 将a减b后的值赋值给a
        System.out.println( a -= b );
//赋值运算符隐含了强制类型转换
//既 (a += b) = (a = a + b) = [a = (int)(a + b)]
    }
}