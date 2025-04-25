package Generics_Demo.Demo3.Test2;

/**
 * @Author HHH
 * @Date 2025/4/23 16:59
 * @Day Day27
 */
//动物类
public abstract class Animal {
    //姓名
    private String name;
    //年龄
    private int age;
    //行为,吃
    public abstract void eat();

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + this.getClass()+ "," + name + "," + age +  "]";
    }
}
