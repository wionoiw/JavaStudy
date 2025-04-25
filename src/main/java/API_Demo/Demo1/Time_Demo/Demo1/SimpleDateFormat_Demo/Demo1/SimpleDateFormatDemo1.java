package API_Demo.Demo1.Time_Demo.Demo1.SimpleDateFormat_Demo.Demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author HHH
 * @Date 2025/4/18 15:29
 * @Day Day22
 */

//SimpleDateFormat类作用
//格式化：把时间变成我们喜欢的格式
//解析：把字符串表示的时间变成Date对象

//构造方法
//public SimpleDateFormat()                                 //构造—个simpleDateFormat使用默认格式
    //默认格式:"yyyy/MM/dd aHH/mm"
//public SimpleDateFormat(String pattern)                   //构造一个simpleDateFormat使用指定的格式

//常用方法
//public final String format(Date date)                     //格式化(日期对象 -> 字符串)
//public Date parse(String source)                          //解析(字符串 -> 日期对象)

//格式化的时间形式的常用的模式对应关系如下:
//年  月   日   时   分   秒  上/下午    星期
//y   M   d    H    m   s    a        E
//示例:
    //"2023-11-11 13:27:06"
    //"yyyy-MM-dd HH:mm:ss"
    //"2023年11月11日 13:27:06"
    //"yyyy年MM月dd日 HH:mm:ss"

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        //对日期进行转换
        zhuanHuan();
        //秒杀活动验证
        miaoSha();
    }

    //需求:
    //假设，你初恋的出生年月日为：2000-11-11
    //请用字符串表示这个数据，并将其转换为：2000年11月11日
    public static void zhuanHuan() throws ParseException {
        //声明要修改的字符串
        String time = "2000-11-11";
        //对原字符串进行解析
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format1.parse(time);
        //对原字符串进行格式化
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy年MM月dd日");
        String Time = format2.format(date);
        //对结果进行输出
        System.out.println(Time);
    }

    //需求:
    //秒杀开始时间:2023年11月11日0:0:0
    //秒杀结束时间:2023年11月11日0:10:0
    //小贾下单并付款的时间为:2023年11月11日0:01:00
    //小皮下单并付款的时间为:2023年11月11日0:11:0
    //用代码说明这两位同学有没有参加上秒杀活动？
    public static void miaoSha() throws ParseException {
        //创建小贾
        String name1 = "小贾";
        String time1 = "2023年11月11日 0:01:00";
        //检验小贾
        ifmiaoSha(name1,time1);

        //创建小皮
        String name2 = "小皮";
        String time2 = "2023年11月11日 0:11:0";
        //检验小皮
        ifmiaoSha(name2,time2);
    }

    public static void ifmiaoSha(String name,String time) throws ParseException {
        //秒杀开始时间
        String Time1 = "2023年11月11日 0:0:0";
        //秒杀结束时间
        String Time2 = "2023年11月11日 0:10:0";
        //时间格式
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //将时间解析
        Date date1 = format.parse(Time1);
        Date date2 = format.parse(Time2);
        Date date = format.parse(time);

        if(date.getTime() > date1.getTime() && date.getTime() < date2.getTime()){
            System.out.println(name + "参加上了秒杀活动");
            return;
        }
        System.out.println(name + "没有参加上秒杀活动");
    }
}
