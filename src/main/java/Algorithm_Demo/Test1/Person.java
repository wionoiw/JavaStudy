package Algorithm_Demo.Test1;

/**
 * @Author HHH
 * @Date 2025/4/21 16:51
 * @Day Day23
 */
//人
public class Person {
    private String name;    //姓名
    private int age;        //年龄
    private double height;  //身高

    @Override
    public String toString() {
        return "["+name+","+age+","+height+"]";
    }

    public Person() {
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
