package Algorithm_Demo.Test2;

/**
 * @Author HHH
 * @Date 2025/4/21 17:47
 * @Day Day25
 */

//需求:
//不死神兔
//有一个很有名的数学逻辑题叫做不死神兔问题，有一对兔子，从出生后第三个月起每个月都生一对兔子
//小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第十二个月的兔子对数为多少?
public class AlgorithmTest2 {
    public static void main(String[] args) {
        System.out.println(getRabbitNum(1,12));
    }

    public static int getRabbitNum(int num,int count){
        //设第n个月兔子数量为f(n),则有
        //n == 1        f(n) == 1
        //n == 1        f(n) == 1
        //n == 2        f(n) == f(n - 1) + f(n - 2)
        //n == 3        f(n) == f(n - 1) + f(n - 2)
        //......
        //n == n        f(n) == f(n - 1) + f(n - 2)

        //前两个月兔子还没有增殖
        if(count == 1 || count == 2){
            return num;
        }
        //递归反复调用
        return getRabbitNum(num,count - 1) + getRabbitNum(num,count - 2);
    }

//    //获取n个月后兔子对数        传入参数为当前小兔子对数,月份数
//    public static int getRabbitNum(int num,int count){
//        Rabbit rabbit0 = new Rabbit(0,1);
//        Rabbit rabbit1 = new Rabbit(1,0);
//        //三个月及以上的兔子对数
//        Rabbit rabbit2 = new Rabbit(2,0);
//        Rabbit[] arr = {rabbit0,rabbit1,rabbit2};
//        arr = proliferation(arr,count);
//        return arr[0].getNum() + arr[1].getNum() + arr[2].getNum();
//    }
//
//    //proliferation 增殖  传入参数为当前兔子对数量,增殖多少轮
//    public static Rabbit[] proliferation(Rabbit[] arr,int count){
//        if(count == 1){
//            return arr;
//        }
//        arr[2].setNum(arr[1].getNum() + arr[2].getNum());
//        arr[1].setNum(arr[0].getNum());
//        arr[0].setNum(arr[2].getNum());
//        return proliferation(arr,--count);
//    }
}

