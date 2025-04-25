package extends_Demo.Test2;

/**
 * @Author HHH
 * @Date 2025/4/7 23:10
 * @Day Day11
 */
//厨师
public class Chef extends Worker{
    //重写工作
    @Override
    public void work(Chef chef){
        this.StirFry();
    }

    //厨师的行为炒菜
    private void StirFry(){
        System.out.println(this.getName() + "正在炒菜");
    }

    public Chef(String id,String name,double wage){
        super(id,name,wage);
    }

    public Chef(){

    }
}
