package interface_Demo.Test1;

/**
 * @Author HHH
 * @Date 2025/4/9 15:33
 * @Day Day13
 */

//动物
public abstract class Animal {
    private String name;

    private int age;

    //吃
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
}
