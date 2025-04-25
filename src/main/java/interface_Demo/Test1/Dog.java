package interface_Demo.Test1;

/**
 * @Author HHH
 * @Date 2025/4/9 15:45
 * @Day Day13
 */
//狗
public class Dog extends Animal implements Swim{

    @Override
    public void eat() {
        System.out.println(this.getName() + "在吃骨头");
    }

    @Override
    public void swim(){
        System.out.println(this.getName() + "在狗刨");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
