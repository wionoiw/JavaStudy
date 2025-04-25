//Day02
package Arithmeticoperator_Demo.Test2;
//需求:按照逢七过的规则输出1~100
//逢七过:当数字中含有七,或者其是七的倍数是喊过
public class ArithmeticoperatorTest2 {
    public static void main(String[] args) {
        for (int a = 1; a <= 100; a++) {
            if (a % 7 == 0 || a % 10 == 7 || a / 10 % 10 == 7) {
                System.out.println("过");
                continue;
            }
            System.out.println(a);
        }
    }
}