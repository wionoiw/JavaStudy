//Day08
package API_Demo.Demo1.String_Demo.Test11;
//需求:
//给你一个字符串s,由若干单词组成,
//单词前后用一些字符隔开,返回字符串中最后一个单词的长度
//单词是指仅有字母组成,不含有任何空格的的最大子字符串
import java.util.Scanner;

public class StringTest11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符串");
        System.out.println("最后一个单词长度为" + changDu(scan.nextLine()));
    }

//    //返回字符串中最后一个单词的长度
//    public static int changDu(String str){
//        StringBuilder sb = new StringBuilder();
//        //状态,代表当前sb中是否存有数据
//        boolean count = false;
//        String[] arr = new String[str.length()];
//        for(int i = 0 ; i < str.length();i++){
//            if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')){
//                sb.append(str.charAt(i));
//                count = true;
//            }else{
//                if(count){
//                    addArr(sb.toString(),arr);
//                }
//                count = false;
//                sb = new StringBuilder();
//            }
//        }
//        if(count){
//            addArr(sb.toString(),arr);
//        }
//        arr = youXiao(arr);
//        return arr[arr.length - 1].length();
//    }
//
//    //截取有效数组
//    public static String[] youXiao(String[] arr){
//        String[] Arr = new String[ifKong(arr)];
//        for(int i = 0;i < arr.length;i++){
//            if(arr[i] != null){
//                addArr(arr[i],Arr);
//            }
//        }
//        return Arr;
//    }
//
//    //数组非空元素
//    public static int ifKong(String[] arr){
//        //计数器,记录非空元素个数
//        int count = 0;
//        for(int i = 0;i < arr.length;i++){
//            if(arr[i] != null){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    //添加元素到数组第一个空位
//    public static void addArr(String str,String[] arr){
//        for(int i = 0;i < arr.length;i++){
//            if(arr[i] == null){
//                arr[i] = str;
//                return;
//            }
//        }
//    }
//返回字符串中最后一个单词的长度
    public static int changDu(String str){
        //计数遇到单词的字母数量
        int count = 0;
        //状态是否遇到了单词
        boolean zhuangtai = false;
        for(int i = str.length() - 1;i >= 0;i--){
            if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')){
               count++;
               zhuangtai = true;
            }else{
                if(zhuangtai){
                    return count;
                }
            }
        }
        return count;
    }
}
