package interface_Demo.Test2;

/**
 * @Author HHH
 * @Date 2025/4/9 17:31
 * @Day Day13
 */
//篮球运动员
public class BasketballPlayer extends Sportsman{
    //学打篮球
    @Override
    public void study() {
        System.out.println("学打篮球");
    }

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }
}
