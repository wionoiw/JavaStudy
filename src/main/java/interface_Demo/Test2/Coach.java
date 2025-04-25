package interface_Demo.Test2;

/**
 * @Author HHH
 * @Date 2025/4/9 17:24
 * @Day Day13
 */
//教练
public abstract class Coach extends Person {
    //教
    public abstract void teach();

    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
}
