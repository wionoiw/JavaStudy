package interface_Demo.Test2;

/**
 * @Author HHH
 * @Date 2025/4/9 17:29
 * @Day Day13
 */
//篮球教练
public class BasketballCoach extends Coach{
    //教打篮球
    @Override
    public void teach() {
        System.out.println("教打篮球");
    }

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }
}
