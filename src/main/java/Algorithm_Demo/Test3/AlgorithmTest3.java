package Algorithm_Demo.Test3;

/**
 * @Author HHH
 * @Date 2025/4/22 8:53
 * @Day Day26
 */

//需求:
//猴子吃桃子
//有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个！以后每天猴子都吃当前剩下来的一半，然后
//再多吃一个，第10天的时候还没吃）发现只剩下一个桃子请问，最初总共多少个桃子？
public class AlgorithmTest3 {
    public static void main(String[] args) {
        System.out.println(qu(10));
    }

    //求桃子原数量    //day为吃了几天后剩一个
    //day10         num == 1
    //day9          num == 2 * (num(day10) + 1)
    //day8          num == 2 * (num(day9) + 1)
    //......
    //day1          num == 2 * (num(day2) + 1)
    public static int qu(int day) {
        if(day == 1) return day;
        day--;
        return 2 * (qu(day) + 1);
    }
}
