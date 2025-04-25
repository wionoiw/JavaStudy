package API_Demo.Demo1.Time_Demo.Demo2.Date_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/19 16:00
 * @Day Day23
 */

//时间类:Date
    //ZoneId 时区
        //static Set<String> getAvailableZoneIds()          获取java中支持的所有时区
        //static ZoneId systemDefault()                     获取系统默认时区
        //static ZoneId of(String zoneId)                   获取一个指定时区

    //Instant 时间戳
        //该类表示的时间,是不带时区的世界标准时间,显示东八区时间要在此基础上加八个小时
        //static Instant now()                      获取当前时间的Instant对象（标准时间）
        //static Instant ofXxx(long epochMilli)    根据(秒/毫秒/纳秒)获取Instant对象
        //ofEpochMilli(long millis) 毫秒
        //ofEpochSecond(long epochSecond) 秒
        //ofEpochSecond(long epochSecond,long nanoAdjustment) 纳秒  //即过了epochSecond+(nanoAdjustment/1000000000)秒
        //ZonedDateTime atZone(ZoneId zone)         指定时区
        //boolean isXxx(Instant otherInstant)       判断系列的方法(时间系列,即年,月,日,时,分,秒等)
        //isBefore(Instant otherInstant)        判断两时间戳先后顺序,即对时间比大小,调用者时间在参数时间前时返回true
        //isAfter(Instant otherInstant)         判断两时间戳先后顺序,即对时间比大小,调用者时间在参数时间后时返回true
        //Instant minusXxx(long millisToSubtract)   减少时间系列的方法
        //Instant plusXxx(long millisToSubtract)    增加时间系列的方法

    //ZoneDateTime 带时区的时间
        //static ZonedDateTime now()                获取当前时间的ZonedDateTime对象
        //static ZonedDateTime ofXxx(...)           获取指定时间的ZonedDateTime对象
        //of(year,month,dayOfMonth,hour,minute,second,nanoOfSecond,zoneId)  //传递年月日时分秒纳秒时区,获取指定时间
        //ofInstant(Instant otherInstant,ZoneId zoneId)                     //传递时间戳和时区,将其组合
        //ZonedDateTime withXxx(时间)                修改时间系列的方法
        //withYear(int year)                    //将年份修改为指定数值,并返回新的ZoneDateTime对象
        //withMonth(int month)                  //将月份修改为指定数值,并返回新的ZoneDateTime对象
        //withDayOfMonth(int dayOfMonth)        //将日期修改为指定数值,并返回新的ZoneDateTime对象
        //withDayOfYear(int dayOfYear)          //将一年当中的第几天修改为指定数值,并返回新的ZoneDateTime对象
        //withHour(int hour)                    //将小时修改为指定数值,并返回新的ZoneDateTime对象
        //withMinute(int minute)                //将分钟修改为指定数值,并返回新的ZoneDateTime对象
        //withSecond(int second)                //将秒钟修改为指定数值,并返回新的ZoneDateTime对象
        //ZonedDateTime minusXxx(时间)               //减少时间系列的方法
        //ZonedDateTime plusXxx(时间)                //增加时间系列的方法
public class DateDemo1 {
}
