package extends_Demo.Test2;

/**
 * @Author HHH
 * @Date 2025/4/7 23:08
 * @Day Day11
 */
import java.util.Scanner;
//经理
public class Manager extends Worker{
    //重写工作
    @Override
    public void work(Chef chef){
        this.managementWage(chef);
    }

    //管理厨师的奖金
    private void managementWage(Worker worker){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入工资要修改为的值");
        double temp = scan.nextDouble();
        worker.setWage(temp);
    }

    public Manager(String id, String name, double wage) {
        super(id, name, wage);
    }

    public Manager(){

    }
}
