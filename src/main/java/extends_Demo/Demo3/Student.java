package extends_Demo.Demo3;

/**
 * @Author HHH
 * @Date 2025/4/7 17:15
 * @Day Day11
 */
public class Student extends Person {
    //重写方法注解
    //重写eat方法
    @Override
    public void eat(){
        System.out.println("吃零食");
    }

    @Override
    public void drink(){
        System.out.println("喝牛奶");
    }
}
