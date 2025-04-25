package extends_Demo.Test2;

/**
 * @Author HHH
 * @Date 2025/4/7 23:09
 * @Day Day11
 */
//工人
public class Worker {
    //工号
    private String id;
    //姓名
    private String name;
    //工资
    private double wage;

    //吃饭
    public void eat() {
        System.out.println(this.name +"正在吃米饭");
    }

    //工作
    public void work(Chef chef){

    }

    public Worker() {
    }

    public Worker(String id, String name, double wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
