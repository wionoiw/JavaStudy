package Gather_Demo.Collection_Demo.Set_Demo.HashSet_Demo.Test1;

import java.util.Objects;

/**
 * @Author HHH
 * @Date 2025/4/24 21:14
 * @Day Day28
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public boolean equals(Object obj) {
        Student stu = (Student)obj;
        return (this.name == stu.getName() && this.age == stu.getAge());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
