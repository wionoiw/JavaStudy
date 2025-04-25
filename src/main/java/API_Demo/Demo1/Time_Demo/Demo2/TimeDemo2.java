package API_Demo.Demo1.Time_Demo.Demo2;

/**
 * @Author HHH
 * @Date 2025/4/18 22:08
 * @Day Day22,23
 */

//JDK8添加的时间相关类
//细节:
//JDK8新增的时间对象都是不可变的
//如果我们修改了,减少了,增加了时间
//那么调用者是不会发生改变的,产生一个新的时间

//JDK7和JDK8时间相关类对比
    //代码层面
        //JDK7:代码麻烦     //日期对象(先计算再比较)毫秒值
        //JDK8:简单       //判断的方法,计算时间间隔的方法
    //安全层面
        //JDK7:多线程环境下会导致数据安全的问题
        //JDK8:时间日期对象都是不可变的,解决了这个问题(方法中有数据修改会new一个新的数据并传出)


//JDK8添加的时间相关类

    //时间类:Date
        //ZoneId 时区
        //Instant 时间戳
        //ZoneDateTime 带时区的时间

    //日期格式化类:SimpleDateFormat
        //DateTimeFormatter 用于时间的格式化和解析

    //日历类:Calender
        //LocalDate 年,月,日
        //LocalTime 时,分,秒
        //LocalDateTime 年,月,日,时,分,秒

    //工具类Tool
        //Duration          //用于计算两个“时间”间隔(秒,纳秒)
        //Period            //用于计算两个“时间”间隔(年,月,日)
        //ChronoUnit        //用于计算两个“时间”间隔(所有单位)
public class TimeDemo2 {
}
