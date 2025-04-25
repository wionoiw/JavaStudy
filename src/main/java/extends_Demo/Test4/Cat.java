package extends_Demo.Test4;

/**
 * @Author HHH
 * @Date 2025/4/8 23:47
 * @Day Day12
 */
//猫
public class Cat extends Animal{
    @Override
    public void eat(String something){
        System.out.println(this.getAge()+"岁的" + this.getColour() + "颜色的猫眯着眼睛侧着头吃" + something);
    }

    //抓老鼠
    public void catchMouse(){
        System.out.println(this.getAge()+"岁的" + this.getColour() + "颜色的猫眯在抓老鼠");
    }

    public Cat() {
    }

    public Cat(int age, String colour) {
        super(age, colour);
    }
}
