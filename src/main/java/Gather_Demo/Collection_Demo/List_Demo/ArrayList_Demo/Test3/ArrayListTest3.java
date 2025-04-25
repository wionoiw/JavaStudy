//Day09
package Gather_Demo.Collection_Demo.List_Demo.ArrayList_Demo.Test3;
//需求:main方法中定义一个集合,存入三个用户对象
//用户属性为:id,username,password
//要求:定义一个方法,根据id查找对应的用户信息
//存在返回true,不存在返回false

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListTest3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        User user1 = new User("1","张三","050302");
        User user2 = new User("2","李四","000721");
        User user3 = new User("3","王五","060504");
        ArrayList<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        System.out.println("请输入要查找用户的id");
        System.out.println(chaZhao(scan.nextLine(),list));
    }

    //根据id查找对应的用户信息
    public static boolean chaZhao(String id,ArrayList<User> list){
        for(int i = 0;i < list.size();i++){
            if(list.get(i).getId().equals(id)){
                System.out.println(list.get(i).getId() + "," +list.get(i).getUsername());
                return true;
            }
        }
        System.out.println("没有id为"+ id +"的用户");
        return false;
    }
}
