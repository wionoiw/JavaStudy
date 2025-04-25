package Algorithm_Demo.Test1;

import java.util.Arrays;

/**
 * @Author HHH
 * @Date 2025/4/21 16:49
 * @Day Day23
 */

//需求:
//按照要求进行排序
//定义数组并存储一些人，利用Arrays中的sort方法进行排序
//要求1：属性有姓名、年龄、身高
//要求2：按照年龄的大小进行排序,年龄一样,按照身高排序,身高一样按照姓名的字母进行排序
//(姓名中不要有中文或特殊字符，会涉及到后面的知识)
public class AlgorithmTest1 {
    public static void main(String[] args) {
        //创建对象
        Person p1_1 = new Person("p1",20,180.1);
        Person p1_2 = new Person("p1",20,190.1);
        Person p1_3 = new Person("p1",30,180.1);
        Person p2 = new Person("p2",20,180.1);

        //将对象添加进arr
        Person[] arr = {p1_1,p1_2,p1_3,p2};
        //对arr按照规则排序
        sortPerson(arr);
        //输出数组
        System.out.println(Arrays.toString(arr));
    }

    //对人数组进行排序
    public static void sortPerson(Person[] arr) {
        Arrays.sort(arr,(o1, o2) -> {
            if(o1.getAge() != o2.getAge()){
                return o1.getAge() - o2.getAge();
            }
            if(o1.getHeight() != o2.getHeight()){
                return (int)(o1.getHeight() - o2.getHeight());
            }

            //对年龄进行判断
            return o1.getName().compareTo(o2.getName());

            //对年龄进行判断
//            String str1 = o1.getName();
//            String str2 = o2.getName();
//            int i = 0;
//            while(true){
//                if(i == str1.length()){
//                    return -1;
//                }
//                if(i == str2.length()){
//                    return 1;
//                }
//                if(str1.charAt(i) != str2.charAt(i)){
//                    return str1.charAt(i) - str2.charAt(i);
//                }
//                i++;
//            }

        });
    }
}
