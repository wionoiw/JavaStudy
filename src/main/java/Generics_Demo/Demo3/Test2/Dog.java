package Generics_Demo.Demo3.Test2;

/**
 * @Author HHH
 * @Date 2025/4/23 17:09
 * @Day Day27
 */
//狗类
public abstract class Dog extends Animal{
    //行为,吃
    @Override
    public abstract void eat() ;

    public Dog(){
    }

    public Dog(String name,int age){
        super(name, age);
    }
}
