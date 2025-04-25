package Generics_Demo.Demo3.Test2;

/**
 * @Author HHH
 * @Date 2025/4/23 17:18
 * @Day Day27
 */

//哈士奇
public class HuskiesDog extends Dog{
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的,"+getAge()+"岁的哈士奇,正在吃骨头,边吃边拆家");
    }

    public HuskiesDog() {
    }

    public HuskiesDog(String name, int age) {
        super(name, age);
    }
}
