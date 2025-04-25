package API_Demo.Demo1.Time_Demo.Demo1.Calendar_Demo.Demo1;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author HHH
 * @Date 2025/4/18 20:34
 * @Day Day22
 */

//Calendar概述
//Calendar代表了系统当前时间的日历对象,可以单独修改获取时间中的年,月,日

//Calendar是一个抽象类,不能直接创建对象
//获取Calendar日历类对象的方法
//方法名说明
//public static Calendar getInstance()                  //获取当前时间的日历对象

//Calendar常用方法
//方法名说明
//public final Date getTime()                           //获取日期对象
//public final setTime(Date date)                       //给日历设置日期对象
//public long getTimeInMillis()                         //拿到时间毫秒值
//public void setTimeInMillis(long millis)              //给日历设置时间毫秒值
//public int get(int field)                             //取日历中的某个字段信息
//public void set(int field,int value)                  //修改日历的某个字段信息
    //field表示要修改的字段索引         value要修改为的值
//public void add(int field,int amount)                 //为某个字段增加/减少指定的值
    //field表示要修改的字段索引         amount为正数则为指定字段增加的值,为负数即为减

//常用修改字段索引(常量)
//ERA=0 纪元
//YEAR=1 年
//MONTH=2 月
//WEEK_OF_YEAR=3 一年中的第几周
//WEEK_OF_MONTH=4 一个月中的第几周
//DATE=DAY_OF_MONTH=5 一个月中的第几天(日期)
//DAY_OF_YEAR=6 一年中的第几天(日期)
//DAY_OF_WEEK=7 一周中的第几天(星期)
//......(共十七个索引)

public class CalendarDemo1 {
    public static void main(String[] args){
        //1.获取日历对象
        //细节1:Calendar是一个抽象类,不能直接new,而是通过一个静态方法获取到子类对象
        //底层原理:
        //会根据系统的不同时区来获取不同的日历对象
        //把会把时间中的纪元,年,月,日,时,分,秒,星期,等等的都放到一个数组当中
        //Calendar默认是运行时间
        //细节2:
        //月份:范围0~11如果获取出来的是0,那么实际上是1月
        //星期:在老外的眼里,星期日是一周中的第一天
        // 1(星期日) 2(星期一) 3(星期二) 4(星期三) 5(星期四) 6(星期五) 7(星期六)
        Calendar calendar = Calendar.getInstance();

        //2.通过日历修改Date对象
            //1.通过setTime(Date date)给日历设置对象修改
            //2.通过setTimeInMillis(long millis)给日历设置时间毫秒值修改
        Date d= new Date(0L);
        calendar.setTime(d);

        //修改某个字段的值
        calendar.set(Calendar.YEAR,2023);
        calendar.set(Calendar.MONTH,8);
        calendar.set(Calendar.DAY_OF_MONTH,10);
        //调用方法在这个基础上增加一个月
        calendar.add(Calendar.MONTH,1);
    }
}
