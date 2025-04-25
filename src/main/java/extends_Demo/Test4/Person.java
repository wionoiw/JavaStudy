package extends_Demo.Test4;

/**
 * @Author HHH
 * @Date 2025/4/8 23:55
 * @Day Day12
 */
//饲养员
public class Person {
    private String name;
    private int age;
    private Animal animal;

    //喂养动物
    public void keepPet(Animal animal,String something){
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.eat(something);
        }
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.eat(something);
        }
    }

    //输出养了什么动物
    public void print(){
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            System.out.println("年龄为" +this.getAge() + "岁的" +
                    this.getName() + "养了一只" +this.animal.getColour() + "颜色的" + this.animal.getAge() +"岁的狗");
        }
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            System.out.println("年龄为" +this.getAge() + "岁的" +
                    this.getName() + "养了一只" +this.animal.getColour() + "颜色的" + this.animal.getAge() +"岁的猫");
        }
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
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

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
