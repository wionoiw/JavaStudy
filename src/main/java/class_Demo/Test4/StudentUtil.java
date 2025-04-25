//Day10
package class_Demo.Test4;

import java.util.ArrayList;
import java.util. StringJoiner;
public class StudentUtil {

    //私有化无参构造方法
    private StudentUtil() {
    }

    //输出Student集合中年龄最大的学生
    public static Student getMaxAge(ArrayList<Student> list){
        //记录年龄最大的学生在集合中的下标
        int count = -1;
        //用于比较年龄
        int tempAge = -1;
        //循环比较
        for(int i = 0;i < list.size();i++){
            if(list.get(i).getAge() > tempAge){
                tempAge = list.get(i).getAge();
                count = i;
            }
        }
        if(count == -1){
            Student stu = new Student();
            System.out.println("集合中没有学生对象");
            return stu;
        }else{
            return list.get(count);
        }
    }

    //打印Student对象
    public static void printStudent(Student stu){
        StringJoiner sj = new StringJoiner(",","[","]");
        sj.add(stu.getName());
        sj.add(stu.getAge() + "");
        sj.add(stu.getGender() +"");
        System.out.println(sj.toString());
    }
}
