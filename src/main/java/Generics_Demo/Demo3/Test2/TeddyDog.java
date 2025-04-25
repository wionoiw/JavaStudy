package Generics_Demo.Demo3.Test2;

/**
 * @Author HHH
 * @Date 2025/4/23 17:17
 * @Day Day27
 */
//泰迪
public class TeddyDog extends Dog{
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的,"+getAge()+"岁的泰迪,正在吃骨头,边吃边蹭");
    }

    public TeddyDog() {
    }

    public TeddyDog(String name, int age) {
        super(name, age);
    }
}
