//Day02
package while_Demo.Demo2;

//do ~ while循环语句
//do{
// 循环体语句;
// }while(条件控制语句);

//与while循环的区别是,while循环先判断在执行,do ~ while循环先执行在判断
public class whileDemo2 {
    public static void main(String[] args){
        int a = 10;
        //用变量b来记录循环次数
        int b = 0;
        do{
            b++;
            a--;
        }while(a >= 0);
        //循环共执行了11次,最后一次a不满足条件
        System.out.println("循环执行了" + b + "次");
    }
}