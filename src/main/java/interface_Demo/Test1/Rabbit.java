package interface_Demo.Test1;

/**
 * @Author HHH
 * @Date 2025/4/9 15:46
 * @Day Day13
 */
//兔子
public class Rabbit extends Animal{
    @Override
    public void eat() {
        System.out.println(this.getName() + "在吃胡萝卜");
    }

    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }
}
