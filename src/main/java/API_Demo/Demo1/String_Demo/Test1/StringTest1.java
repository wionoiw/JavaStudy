//Day05
package API_Demo.Demo1.String_Demo.Test1;
//需求:模拟一个登录注册页面
//要求能够注册新用户,随机分配6位id(首位不为0),用户设定密码
//登录验证账户及密码是否正确
import java.util.Scanner;
public class StringTest1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        User[] arr = new User[0];
        while(true){
            int i = index(arr);
            if(i == 1){
                System.out.println("请输入你的账号");
                int id = scanner.nextInt();
                System.out.println("请输入你的密码");
                String code = scanner.next();
                login(id,code,arr);
            }else if(i == 2){
                User temp = new User(arr);
                arr = temp.addArr(arr);
            }else if(i == 3){
                print(arr);
            }else{
                System.out.println("已退出系统");
                break;
            }
        }
    }

    //主页面
    public static int index(User[] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----登陆注册系统------");
        System.out.println("--------------------");
        System.out.println("--按1进行登录---------");
        System.out.println("--按2进行注册---------");
        System.out.println("--按3遍历输出当前所有用户");
        System.out.println("--其他按键退出系统-----");
        System.out.println("--------------------");
        return scanner.nextInt();

    }

    //遍历当前所有用户
    public static void print(User[] arr){
        for(int i = 0;i < arr.length;i++){
            //判断数组当前项是否为空,为空则跳过本次循环
            if(arr[i] == null){
                continue;
            }
            System.out.println(arr[i].getId() + "  " + arr[i].getName() + "  " + arr[i].getCode());
        }
    }


    //登录
    public static void login(int id,String code,User[] arr){
        //首先判断是否存在该id
        if(ifID(id,arr)){
           //查询该id在数组中所处位置
            if(arr[ifUser(id,arr)].getCode().equalsIgnoreCase(code)){
                System.out.println("登陆成功\n" + arr[ifUser(id,arr)].getName() +",欢迎您");
            }else{
                System.out.println("输入的账号或密码错误,请重新输入");
            }
        }else{
            System.out.println("输入的账号或密码错误,请重新输入");
        }
    }

    //用id查询用户
    public static int ifUser(int id,User[] arr){
        for(int i = 0;i < arr.length;i++ ){
            //判断数组当前项是否为空,为空则跳过本次循环
            if(arr[i] == null){
                continue;
            }
            if(arr[i].getId() == id){
                return i;
            }
        }
        return 0;
    }

    //判断是否已有相同id
    public static boolean ifID(int id,User[] arr){
        for(int i = 0;i < arr.length;i++ ){
            //判断数组当前项是否为空,为空则跳过本次循环
            if(arr[i] == null){
                continue;
            }
            if(arr[i].getId() == id){
                return true;
            }
        }
        return false;
    }

}
