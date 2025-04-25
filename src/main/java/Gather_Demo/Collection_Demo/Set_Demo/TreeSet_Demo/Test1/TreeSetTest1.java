package Gather_Demo.Collection_Demo.Set_Demo.TreeSet_Demo.Test1;

import java.util.TreeSet;

/**
 * @Author HHH
 * @Date 2025/4/24 23:14
 * @Day Day28
 */

//需求：创建5个学生对象
//属性： (姓名,年龄，语文成绩,数学成绩,英语成绩),
//按照总分从高到低输出到控制台
//如果总分一样，按照语文成绩排
//如果语文一样，按照数学成绩排
//如果数学成绩一样，按照英语成绩排
//如果英文成绩一样，按照年龄排
//如果年龄一样，按照姓名的字母顺序排
//如果都一样，认为是同一个学生,不存。
public class TreeSetTest1 {
    public static void main(String[] args) {
        test1();

    }

    public static void test1(){
        System.out.println("测试用例1：正常排序");
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student("张三", 15, 85, 90, 80));
        set.add(new Student("李四", 14, 80, 95, 85));
        set.add(new Student("王五", 16, 85, 90, 85));
        set.add(new Student("赵六", 14, 80, 95, 80));
        set.add(new Student("孙七", 15, 80, 90, 85));
        set.forEach(o -> System.out.println(o));

    }


}
