//Day08
package Gather_Demo.Collection_Demo.List_Demo.ArrayList_Demo.Test1;
//需求:定义一个集合,添加字符串,并进行遍历
//遍历格式参照:[元素1,元素2,元素3]

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("请输入要添加元素的个数");
        int num = scan.nextInt();
        //消耗掉缓冲区内的换行符
        scan.nextLine();
        for(int i = 1;i <= num;i++){
            System.out.println("请输入要添加的第" + i + "个元素");
            list.add(scan.nextLine());
        }
//        System.out.println(list);
        //进行遍历
        System.out.print("[");
        for(int i = 0; i < list.size();i++){
            System.out.print(list.get(i));
            if(i != list.size() - 1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
