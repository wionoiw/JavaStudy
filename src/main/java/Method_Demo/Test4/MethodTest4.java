//Day03
package Method_Demo.Test4;
//需求:机票价格按照淡季旺季,头等舱和经济舱收费,输入机票原价,月份和头等舱或经济舱
//旺季(5~10月),头等舱9折,经济舱8.5折淡季(11月到来年4月)头等舱7折,经济舱6.5折
import java.util.Scanner;
public class MethodTest4 {
    public static void main(String[] orgs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请依次输入机票原价,当前月份,头等舱或经济舱,头等舱输1,经济舱输2");
        double jiaGe = scanner.nextInt();
        int yueFen = scanner.nextInt();
        int cangWei = scanner.nextInt();
        System.out.print("机票价格为" + jiSuan(jiaGe,yueFen,cangWei));
    }
    public static double jiSuan(double jiaGe,int yueFen,int cangWei){
        //折扣价格
        double num = 0;
        //旺季
        if(yueFen >= 5 && yueFen <= 10){
            //头等舱
            if(cangWei == 1){
                num = jiaGe * 0.9;
            //经济舱
            }else if(cangWei == 2){
                num = jiaGe * 0.85;
            }else{
                System.out.println("没有这个舱位");
            }
            //淡季
        }else if((yueFen >= 0 && yueFen <= 4) || (yueFen >= 1 && yueFen <= 12)){
            //头等舱
            if(cangWei == 1){
                num = jiaGe * 0.7;
            //经济舱
            }else if(cangWei == 2){
                num = jiaGe * 0.65;
            }else{
                System.out.println("没有这个舱位");
            }
        }else{
            System.out.println("输入的月份不合法");
        }
        return num;
    }
}
