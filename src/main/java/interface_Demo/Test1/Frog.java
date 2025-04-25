package interface_Demo.Test1;

/**
 * @Author HHH
 * @Date 2025/4/9 15:42
 * @Day Day13
 */
//青蛙
public class Frog extends Animal implements Swim{

    @Override
    public void eat() {
        System.out.println(this.getName() + "在吃虫子");
    }

    @Override
    public void swim(){
        System.out.println(this.getName() + "在蛙泳");
    }

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }
}
