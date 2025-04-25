package interface_Demo.Test2;

/**
 * @Author HHH
 * @Date 2025/4/9 17:32
 * @Day Day13
 */
//乒乓球运动员
public class TableTennisPlayer extends Sportsman implements SpeakEnglish{
    //学打乒乓球
    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }

    //说英语
    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }

    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }
}
