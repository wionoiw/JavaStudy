package Generics_Demo.Demo3.Test2;

/**
 * @Author HHH
 * @Date 2025/4/23 17:12
 * @Day Day27
 */

//波斯猫类
public class PersianCat extends Cat {
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的,"+getAge()+"岁的波斯猫,正在吃小饼干");
    }

    public PersianCat() {
    }

    public PersianCat(String name, int age) {
        super(name, age);
    }
}
