package interface_Demo.Test2;

/**
 * @Author HHH
 * @Date 2025/4/9 17:27
 * @Day Day13
 */
//乒乓球教练
public class TableTennisCoach extends Coach implements SpeakEnglish{
    //教打乒乓球
    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    //说英语
    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }

    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }
}
