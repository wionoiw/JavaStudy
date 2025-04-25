package extends_Demo.Test4;

/**
 * @Author HHH
 * @Date 2025/4/8 23:52
 * @Day Day12
 */
//狗
public class Dog extends Animal{
    @Override
    public void eat(String something){
        System.out.println(this.getAge()+"岁的" + this.getColour() + "颜色的狗两只前腿死死的抱住" + something +"猛吃");
    }

    //看家
    public void lookHome(){
        System.out.println(this.getAge()+"岁的" + this.getColour() + "颜色的狗在看家");
    }

    public Dog() {
    }

    public Dog(int age, String colour) {
        super(age, colour);
    }
}
