//Day05
package API_Demo.Demo1.String_Demo.Test1;
//用户属性有id,昵称,密码

import java.util.Random;
import java.util.Scanner;

public class User {
    private int id;
    private String name;
    private String code;

//    //用户数组排序(根据id大小)
//    public User[] sortArr(User[] arr){
//        User[] Arr = new User[ifArr(arr)];
//        for(int i = 0;i <Arr.length;i++){
//            //将arr数组中id最小项赋值给Arr
//            Arr[i] = arr[sortArrmin(arr)];
//            arr[sortArrmin(arr)] = null;
//        }
//        return Arr;
//    }
    //重新实现排序方法
    public User[] sortArr(User[] arr) {
        User[] newArr = new User[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        for (int i = 0; i < newArr.length - 1; i++) {
            for (int j = 0; j < newArr.length - 1 - i; j++) {
                if (newArr[j] != null && newArr[j + 1] != null && newArr[j].getId() > newArr[j + 1].getId()) {
                    User temp = newArr[j];
                    newArr[j] = newArr[j + 1];
                    newArr[j + 1] = temp;
                }
            }
        }
        return newArr;
    }

    //判断数组中有几个非空项
    public int ifArr(User[] arr){
        int a = 0;
        for(int i = 0;i < arr.length;i++ ){
            if(arr[i] != null){
                a++;
            }
        }
        return a;
    }

    //判断数组中有无空位
    public boolean ifArr2(User[] arr){
        int a = 0;
        for(int i = 0;i < arr.length;i++ ){
            if(arr[i] == null){
                return true;
            }
        }
        return false;
    }

//    //用户数组排序(查找最小id)
//    public int sortArrmin(User[] arr){
//        int a = 0;
//        int temp = arr[0].getId();
//        for(int i = 0;i < arr.length;i++){
//            //判断数组当前项是否为空,为空则跳过本次循环
//            if(arr[i] == null){
//                continue;
//            }
//            if(arr[i].getId() < temp){
//                a = i;
//                temp = arr[i].getId();
//            }
//
//        }
//        return a;
//    }

    //判断是否已有相同id,已有返回false,没有返回true
    public boolean ifID(User[] arr){
        for(int i = 0;i < arr.length;i++ ){
            //判断数组当前项是否为空,为空则跳过本次循环
            if(arr[i] == null){
                continue;
            }
            if(arr[i].getId() == this.getId()){
                return false;
            }
        }
        return true;
    }

    //将用户添加到用户数组中
    public User[] addArr(User[] arr){
        //判断数组是否有空位
        if(ifArr2(arr)){
            //寻找空位插入
            for(int i = 0;i < arr.length;i++ ){
                if(arr[i] == null){
                    arr[i] = this;
                    return sortArr(arr);
                }
            }
        }else{
            //原数组没有空位,新建数组,拷贝原数组后添加新用户
            User[] newArr = new User[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[arr.length] = this;
            return sortArr(newArr);
        }
        return sortArr(arr);
    }

    //无参构造
    public User() {
    }

    //创建用户的构造
    public User(User[] arr) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("请设置你的昵称");
        this.name = scan.next();
        System.out.println("请设置密码");
        this.code = scan.next();
        //生成并判断是否已有相同id,如果有重新生成
        while(true){
            this.id = ran.nextInt(900000) + 100000;
            if(ifID(arr)){
                System.out.println("注册成功,你的账号是" + this.getId() + "请截图保存");
                break;
            }
        }
    }

    //全参构造
    public User(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}