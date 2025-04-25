package Generics_Demo.Demo3.Test2;

import java.util.Scanner;

/**
 * @Author HHH
 * @Date 2025/4/23 17:05
 * @Day Day27
 */
//猫类
public abstract class Cat extends Animal{
    //行为,吃
    @Override
    public abstract void eat() ;

    public Cat(){
    }

    public Cat(String name,int age){
        super(name, age);
    }
}
