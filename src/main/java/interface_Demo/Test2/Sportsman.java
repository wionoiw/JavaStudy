package interface_Demo.Test2;

/**
 * @Author HHH
 * @Date 2025/4/9 17:20
 * @Day Day13
 */
//运动员
public abstract class Sportsman extends Person {
    //学
    public abstract void study();

    public Sportsman() {
    }

    public Sportsman(String name, int age) {
        super(name, age);
    }
}
