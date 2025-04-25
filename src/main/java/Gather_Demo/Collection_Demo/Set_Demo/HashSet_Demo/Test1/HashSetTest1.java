package Gather_Demo.Collection_Demo.Set_Demo.HashSet_Demo.Test1;

import java.util.HashSet;
import java.util.StringJoiner;

/**
 * @Author HHH
 * @Date 2025/4/24 21:13
 * @Day Day28
 */

//需求:创建一个存储学生对象的集合,存储多个学生对象。
//使用程序实现在控制台遍历该集合
//要求:学生对象的成员变量值相同,我们就认为是同一个对象
public class HashSetTest1 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 17);
        Student stu2 = new Student("张三", 18);
        Student stu3 = new Student("李四", 17);
        Student stu4 = new Student("李四", 17);
        Student stu5 = new Student("张三", 17);
        Student stu6 = new Student("王五", 17);

        HashSet<Student> set = new HashSet<>();

        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);
        set.add(stu5);
        set.add(stu6);

        StringJoiner sj = new StringJoiner(",","[","]");

        set.forEach(o -> sj.add(o.toString()));

        System.out.println(sj.toString());
        System.out.println(stu3.equals(stu4));

    }

}
