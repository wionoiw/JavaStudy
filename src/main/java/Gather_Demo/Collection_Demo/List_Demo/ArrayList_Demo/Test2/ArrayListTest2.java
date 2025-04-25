//Day08
package Gather_Demo.Collection_Demo.List_Demo.ArrayList_Demo.Test2;
//需求:定义一个集合,添加一些学生对象,并进行遍历
//学生类的属性为:姓名,年龄
//要求:对象的数据来自键盘输入

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListTest2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入要创建的学生数量:");
        int num = scan.nextInt();
        scan.nextLine();
        ArrayList<Student> list = new ArrayList<>();
        for(int i = 1;i <= num;i++){
            System.out.println("\n创建第" + i + "个学生");
            list.add(chuangJian());
        }
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i).getName() + "," +list.get(i).getAge());
        }
    }

    //创建学生对象
    public static Student chuangJian(){
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入学生姓名:");
        String name = scan.nextLine();
        System.out.print("请输入学生年龄");
        int age = scan.nextInt();
        Student stu = new Student(name,age);
        return stu;
    }
}
