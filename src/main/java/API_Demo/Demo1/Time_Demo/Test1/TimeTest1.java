package API_Demo.Demo1.Time_Demo.Test1;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author HHH
 * @Date 2025/4/19 19:12
 * @Day Day23
 */

//请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成
public class TimeTest1 {
    public static void main(String[] args){
        JDK7();
        JDK8();
    }

    //现计算你活了多少天,JDK7
    public static void JDK7(){
        Calendar calendar = Calendar.getInstance();
        //Calendar中月份从0开始到11结束
        calendar.set(2005,2,2);
        Date date1 = calendar.getTime();
        Date date2 = new Date();
        long num = date2.getTime() - date1.getTime();
        int Day = (int)(num / (1000L * 60 * 60 * 24));
        int year = (int)(num / (1000L * 60 * 60 * 24 * 365));
        num %= 1000L * 60 * 60 * 24 * 365;
        int month = (int)(num / (1000L * 60 * 60 * 24 * 30));
        num %= 1000L * 60 * 60 * 24 * 30;
        int day = (int)(num / (1000L * 60 * 60 * 24));
        num %= 1000L * 60 * 60 * 24;
        if(num != 0){
            day++;
        }
        System.out.println("你到今天一共活了" + year + "年" + month + "月" + day +"天");
    }

    //现计算你活了多少天,JDK8
    public static void JDK8(){
        LocalDate localDate1 = LocalDate.of(2005,3,2);
        LocalDate localDate2 = LocalDate.now();
        Period period = Period.between(localDate1,localDate2);
        System.out.println("你到今天一共活了" + period.getYears() + "年" + period.getMonths() + "月" + period.getDays() +"天");
    }
}
