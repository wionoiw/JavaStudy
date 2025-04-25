package extends_Demo.Test1;

/**
 * @Author HHH
 * @Date 2025/4/7 22:29
 * @Day Day11
 */
import java.util.Random;
//沙皮狗
public class ShariPei extends Dog{
    //吃饭
    @Override
    public void eat(){
        Random ran = new Random();
        //利用随机数来输出沙皮狗吃的两种事物
        int temp = ran.nextInt(2);
        String str = temp == 0 ? "吃狗粮" : "吃骨头";
        System.out.println(str);
    }
}
