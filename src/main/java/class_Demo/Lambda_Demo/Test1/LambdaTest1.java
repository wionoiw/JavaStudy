package class_Demo.Lambda_Demo.Test1;

import java.util.Arrays;

/**
 * @Author HHH
 * @Date 2025/4/21 16:40
 * @Day Day25
 */

//利用Lambda表达式简化comparator接口的匿名形式
//定义数组并存储一些字符串,利用Arrays中的sort方法进行排序
//要求:
//按照字符串的长度进行排序,短的在前面,长的在后面
//（暂时不比较字符串里面的内容）
public class LambdaTest1 {
    public static void main(String[] args) {
        String[] arr={"a","aaaa","aaa","aa"};
        Arrays.sort(arr,(o1,o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(arr));
    }
}
