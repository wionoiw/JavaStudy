//Day10
package class_Demo.Test4;

//需求: 定义一个集合,用于存储三个学生对象
//学生类的属性为:name,age,gender
//定义一个工具类,用于获取集合中最大学生的年龄
import java.util.ArrayList;

public class classTest4 {
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三",18,'男');
        Student stu2 = new Student("李四",19,'男');
        Student stu3 = new Student("王五",20,'女');
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        Student stutemp = StudentUtil.getMaxAge(list);
        StudentUtil.printStudent(stutemp);

    }
}
