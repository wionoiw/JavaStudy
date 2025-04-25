package Generics_Demo.Demo3.Test2;

/**
 * @Author HHH
 * @Date 2025/4/23 17:15
 * @Day Day27
 */

//狸花猫
public class TanukiCat extends Cat{
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的,"+getAge()+"岁的狸花猫,正在吃鱼");
    }

    public TanukiCat() {
    }

    public TanukiCat(String name, int age) {
        super(name, age);
    }
}
