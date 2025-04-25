package extends_Demo.Test4;

/**
 * @Author HHH
 * @Date 2025/4/8 23:41
 * @Day Day12
 */
//动物
public class Animal {
    private int age;
    private String colour;

    public void eat(String something){
        System.out.println(this.age+"岁的" + this.colour + "颜色的动物在吃" + something);
    }

    public Animal() {
    }

    public Animal(int age, String colour) {
        this.age = age;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
