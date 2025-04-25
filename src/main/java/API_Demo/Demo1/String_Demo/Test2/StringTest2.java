//Day06
package API_Demo.Demo1.String_Demo.Test2;
//需求:定义一个方法,把输入一段字符串,整理成数组,按照指定的格式拼接成一个字符串返回,调用该方法并在控制台输出结果
import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args){
        jianRu();
    }

    //键盘键入数字,并将其转化为int数组
    public static void jianRu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一段字符串,程序将输出其中的数字");
        String str = scan.nextLine();
        //将字符串中的整数筛选出来,并打印
        System.out.println(pinJie(youXiao(ifNum(str))));
    }

    //剪切有效数组,并将ASCII码表转化为显示数组
    public static int[] youXiao(int[] arr){
        int temp = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != 0){
                temp++;
            }
        }
        int[] Arr = new int[temp];
        for(int i = 0;i < Arr.length;i++){
            //将经过加1处理的数据进行还原
            Arr[i] = arr[i] - 1;
        }
        return Arr;
    }

    //将字符串中的整数筛选出来
    public static int[] ifNum(String str){
        int[] arr = new int[str.length()];
        int temp = 0;
        //判断是否遇到了数
        boolean hasDigit = false;
        for(int i = 0;i < str.length();i++){
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                hasDigit = true;
                temp = temp * 10 + (str.charAt(i) - '0');
            }else{
                //将整数加1存储,防止当整数为0时被误判为空
                if(hasDigit){
                    arr = cunChu(temp+1,arr);
                }
                temp = 0;
                hasDigit = false;
            }
        }
        //循环结束后,检查temp中是否有未添加的数据
        if(hasDigit){
            arr = cunChu(temp+1,arr);
        }
        return arr;
    }

    //将新数据存储到数组最前方空位中
    public static int[] cunChu(int num,int[] arr){
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == 0){
                arr[i] = num;
                return arr;
            }
        }
        return arr;
    }

    //把int数组中的数据,按照指定的格式拼接成一个字符串返回
    public static String pinJie(int[] arr){
        String str = "[";
        for(int i = 0;i < arr.length;i++){
            str += arr[i];
            if(i != arr.length - 1){
                str += ",";
            }
        }
        str += "]";
        return str;
    }

}
