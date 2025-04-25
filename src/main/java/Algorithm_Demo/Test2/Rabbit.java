package Algorithm_Demo.Test2;

/**
 * @Author HHH
 * @Date 2025/4/21 17:58
 * @Day Day25
 */
//兔子对类
class Rabbit {
    private int age;    //当前年龄(单位月)
    private int num;    //当前年龄的兔子有多少对

    public Rabbit() {
    }

    public Rabbit(int age, int num) {
        this.age = age;
        this.num = num;
    }

    public int getAge() {
        return age;
    }

    public int getNum() {
        return num;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
