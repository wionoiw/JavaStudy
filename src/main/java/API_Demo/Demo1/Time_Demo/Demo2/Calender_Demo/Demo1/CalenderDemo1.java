package API_Demo.Demo1.Time_Demo.Demo2.Calender_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/19 16:04
 * @Day Day23
 */

//日历类:Calender

    //LocalDate 年,月,日
        //static XXX now()                              //获取当前时间的对象
        //static XXX of(...)                            //获取指定时间的对象
        //get开头的方法                                   //获取日历中的年,月,日,时,分,秒等信息
            //在LocalDate中没有时分秒,在LocalTime中没有年月日
        //isBefore, isAfter                             //比较两个LocalDated的先后
        //with开头的                                     //修改时间系列的方法
        //minus开头的                                    //减少时间系列的方法
        //plus开头的                                     //增加时间系列的方法
        //public boolean isLeapYear()           //查看该年是否是闰年,是返回true,否则返回false

    //LocalTime 时,分,秒
        //与LocalDate类似

    //LocalDateTime 年,月,日,时,分,秒
        //public LocalDate toLocalDate()                //转换成一个LocalDate对象
        //public LocalTime toLocalTime()                //转换成一个LocalTime对象
        //与LocalDate类似

public class CalenderDemo1 {
}
