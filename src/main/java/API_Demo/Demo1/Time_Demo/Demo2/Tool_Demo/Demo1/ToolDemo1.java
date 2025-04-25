package API_Demo.Demo1.Time_Demo.Demo2.Tool_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/19 16:06
 * @Day Day23
 */

//工具类Tool

    //Duration          //用于计算两个“时间”间隔(秒,纳秒)
        //public static Duration between(参数一,参数二)      //第二个参数减第一个参数,计算两参数间相差的时分秒
        //直接输出Duration类对象格式为:PT197637H27M42.639166S    代表经过了197637小时27分钟42.639166秒
        //public int toDays()                           //获得两个时间差的天数
        //public int toHours()                          //获得两个时间差的小时数
        //public int toMinutes()                        //获得两个时间差的分钟数
        //public int toMillis()                         //获得两个时间差的毫秒数
        //public int toNanos()                          //获得两个时间差的纳秒数

    //Period            //用于计算两个“时间”间隔(年,月,日)
        //public static period between(参数一,参数二)      //第二个参数减第一个参数,计算两参数间相差的年月日
        //直接输出Period类对象格式为:P22Y6M17D    代表经过了22年6月17天
        //public int getYears()                         //获得Period对象保存的年份
        //public int getMonths()                        //获得Period对象保存的月份
        //public int getDays()                          //获得Period对象保存的每月第几天
        //public int toTotalMonths()                    //获得两个时间差的月数

    //ChronoUnit        //用于计算两个“时间”间隔(所有单位)
        //ChronoUnit.YEARS.between(参数一,参数二)         //获得两个时间差的年数
        //ChronoUnit.MONTHS.between(参数一,参数二)        //获得两个时间差的月数
        //ChronoUnit.WEEKS.between(参数一,参数二)         //获得两个时间差的周数
        //ChronoUnit.DAYS.between(参数一,参数二)          //获得两个时间差的天数
        //ChronoUnit.HOURS.between(参数一,参数二)         //获得两个时间差的时数
        //ChronoUnit.MINUTES.between(参数一,参数二)       //获得两个时间差的分数
        //ChronoUnit.SECONDS.between(参数一,参数二)       //获得两个时间差的秒数
        //ChronoUnit.MILLIS.between(参数一,参数二)        //获得两个时间差的毫秒数
        //ChronoUnit.MICROS.between(参数一,参数二)        //获得两个时间差的微秒数
        //ChronoUnit.NANOS.between(参数一,参数二)         //获得两个时间差的纳秒数
        //ChronoUnit.HALF_DAYS.between(参数一,参数二)     //获得两个时间差的半天数
        //ChronoUnit.DECADES.between(参数一,参数二)       //获得两个时间差的十年数
        //ChronoUnit.CENTURIES.between(参数一,参数二)     //获得两个时间差的世纪(百年)数
        //ChronoUnit.MILLENNIA.between(参数一,参数二)     //获得两个时间差的千年数
        //ChronoUnit.ERAS.between(参数一,参数二)          //获得两个时间差的纪元数

public class ToolDemo1 {
}
