package API_Demo.Demo1.Packaging_Demo.Test1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @Author HHH
 * @Date 2025/4/19 17:17
 * @Day Day23
 */

//键盘录入
//键盘录入一些1~100之间的整数，并添加到集合
//直到集合中所有数据和超过200为止
public class PackagingTest1 {
    //定义集合
    static ArrayList<Integer> list= new ArrayList<Integer>();
    //声明Scanner类对象,避免反复new浪费内存
    static Scanner scanner = new Scanner(System.in);
    //集合数据和与二百的差值
    static int count = 200;
    //输入的临时数据
    static Integer temp;

    public static void main(String[] args){
        System.out.println("请输入1~100之间的整数,总和大于200时会输出所有数");
        while(count > 0){
            addList();
        }
    }

    //键盘录入整数,添加进集合
    public static void addList(){
        //将键盘输入的字符串转换为Integer类型
        temp = Integer.parseInt(scanner.nextLine());
        //对输入的数据进行判断
        if(temp < 1 || temp > 100){
            System.out.println(temp + "不是有效数据");
            return;
        }
        //将其添加进集合
        list.add(temp);
        //判断输入该数后,所有数据和是否大于200
        count -= temp;
        if(count < 0){
            //输出集合所有元素
            printList();
        }
    }

    //输出集合所有元素
    public static void printList(){
        StringJoiner joiner = new StringJoiner(",","[","]");
        for(int i = 0;i < list.size();i++){
            joiner.add(list.get(i) + "");
        }
        System.out.println("集合所有数之和为:" + (200-count));
        System.out.println(joiner.toString());
    }

}
