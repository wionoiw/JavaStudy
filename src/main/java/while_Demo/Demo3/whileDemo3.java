//Day02
package while_Demo.Demo3;
//跳过控制语句
//continue; 跳过本次循环,继续下次循环
//break; 结束循环
public class whileDemo3 {
    public static void main(String[] args){
        for(int a = 1;a <= 10;a++){
            //第三次循环时跳过
            if(a == 3){
                continue;
            }
            //第8次循环时结束循环
            if(a == 8){
                break;
            }
            System.out.println("这是第" + a +"次循环");
        }
    }
}
