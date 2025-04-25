package Algorithm_Demo.Recursion_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/20 16:27
 * @Day Day24
 */

//recursion     递归算法
//递归指的是方法中调用方法本身的现象

//递归算法的作用
//把一个复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解

//书写递归的两个核心:
//找出口:什么时候不再调用方法
//找规则:如何把大问题变成规模较小的问题

//递归的注意点:
    //递归一定要有出口(结束条件)否则就会出现内存溢出
    //方法内部再次调用方法的时候，参数必须要更加地靠近出口
public class RecursionDemo1 {
    public static void main(String[] args) {
        //求100的累加,即1+2+...+100
        int a = accumulateRecursion(100);
        System.out.println(a);
        //求5的阶乘,即5！= 5*4*3*2*1
        int f = factorialRecursion(5);
        System.out.println(f);
    }

    //用递归求数字num的阶乘
    private static int factorialRecursion(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorialRecursion(--num);
    }

    //用递归对数字num累加
    public static int accumulateRecursion(int num) {
        if(num == 1){
            return 1;
        }
        return num + accumulateRecursion(--num);
    }
}
