//Day02
package for_Demo.Demo1;
//for循环
//for(初始化语句;条件判断语句;条件控制语句){
//      循环体语句;
//}
//求和,求1-100之间的和
public class forDemo1 {
    public static void main(String[] args){
        //定义1~100之间的和为变量b
        int b = 0;
        //用for循环从1加到100
        for(int a = 1;a <= 100;a++){
            b += a;
        }
        System.out.println(b);
    }
}