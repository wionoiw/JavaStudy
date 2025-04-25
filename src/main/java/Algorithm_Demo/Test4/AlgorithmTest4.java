package Algorithm_Demo.Test4;

/**
 * @Author HHH
 * @Date 2025/4/22 9:08
 * @Day Day26
 */

//需求
//爬楼梯
//小明有的时候一次爬一个台阶，有的时候一次爬两个台阶。
//如果这个楼梯有20个台阶，小明一共有多少种爬法呢？
//运算结果：
//1层台阶1种爬法
//2层台阶2种爬法
//7层台阶21种爬法

//楼梯数量        //爬法
//num == 1      //1
//num == 2      //2
//num == 3      //3
//num == 4      //5
//斐波那契数列
public class AlgorithmTest4 {
    public static void main(String[] args) {
        System.out.println(climbStairs(20));
        System.out.println(climbStairs1(20));
    }

    public static int climbStairs(int num) {
        if(num == 1) return 1;
        if(num == 2) return 2;
        return climbStairs(num - 1) + climbStairs(num - 2);
    }



    //爬楼梯
    //小明有的时候一次爬一个台阶，有的时候一次爬两个台阶,有的时候一次爬三个台阶
    //如果这个楼梯有20个台阶，小明一共有多少种爬法呢？
    //运算结果：
    //1层台阶1种爬法
    //2层台阶2种爬法

    //楼梯数量        //爬法
    //num == 1      //1+0
    //num == 2      //2=1+1
    //num == 3      //4=1+2+1
    //num == 4      //7=1+2+4
    //......
    //num == num    //f(num) = f(num - 1) + f(num - 2) + f(num - 3)
    public static int climbStairs1(int num) {
        if(num == 1) return 1;
        if(num == 2) return 2;
        if(num == 3) return 4;
        return climbStairs1(num - 1) + climbStairs1(num - 2) + climbStairs1(num - 3);
    }
}
