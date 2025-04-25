package extends_Demo.Test2;

/**
 * @Author HHH
 * @Date 2025/4/7 23:07
 * @Day Day11
 */
public class extendsTest2 {
    public static void main(String[] args){
        //创建经理
        Manager manager = new Manager("001","张三",8000);
        //创建厨师
        Chef chef = new Chef("002","李四",3000);
        //输出两人工资
        System.out.println(chef.getName()+"工资为" + chef.getWage() +"元");
        System.out.println(manager.getName()+"工资为" + manager.getWage() +"元");
        //厨师工作
        chef.work(chef);
        //经理吃饭
        manager.eat();
        //厨师吃饭
        chef.eat();
        //经理工作
        manager.work(chef);
        //输出两人工资
        //输出两人工资
        System.out.println(chef.getName()+"工资为" + chef.getWage() +"元");
        System.out.println(manager.getName()+"工资为" + manager.getWage() +"元");

    }
}
