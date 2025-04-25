//Day07
package API_Demo.Demo1.StringBuilder_Demo.Test1;
//定义一个方法,将键入的字符串中的整数按照指定的格式拼接成一个字符串返回
//输出结果实例 :[1,2,3]

import java.util.Scanner;

public class StringBuilderTest1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符串,程序将输出其中的数字");
        System.out.println(shiBie(scan.nextLine()));
    }

    //识别字符串中的数字
    public static String shiBie(String str){
        //存储临时检测出的数字
        int temp = 0;
        //判断是否记录了数
        boolean ifnum = false;
        StringBuilder sb = new StringBuilder("[");
        //定义数组,用于存储检测出的书
        int[] arr = new int[str.length()];
        //循环检测数字,并添加进数组
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                temp = 10 * temp + (str.charAt(i) - '0');
                ifnum = true;
            }else{
                if(ifnum == true){
                    arr[i] = temp + 1;
                }
                temp = 0;
                ifnum = false;
            }

        }
        //检测循环结束时,temp中是否存有未保存的数据
        if(temp != 0){
            arr[arr.length - 1] = temp + 1;
            //随后记录循环次数
            temp = 0;
        }
        //遍历数组,将数据转成字符串
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != 0){
                if(temp != 0){
                    sb.append(",");
                }
                sb.append(arr[i] - 1);
                temp = 1;
            }
        }
        return sb.append("]").toString();
    }
}
