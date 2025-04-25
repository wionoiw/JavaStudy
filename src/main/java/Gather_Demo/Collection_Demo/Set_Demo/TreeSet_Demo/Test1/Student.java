package Gather_Demo.Collection_Demo.Set_Demo.TreeSet_Demo.Test1;

/**
 * @Author HHH
 * @Date 2025/4/24 23:15
 * @Day Day28
 */

//学生类
public class Student implements Comparable<Student>{
    private String name;    //姓名
    private int age;        //年龄
    private int chineseScores;        //语文成绩
    private int mathScores;           //数学成绩
    private int englishScores;        //英语成绩
    private int grade;        //总成绩

    public Student() {
    }

    public Student(String name, int age, int chineseScores, int mathScores, int englishScores) {
        this.name = name;
        this.age = age;
        this.chineseScores = chineseScores;
        this.mathScores = mathScores;
        this.englishScores = englishScores;
        this.grade = chineseScores + mathScores + englishScores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChineseScores() {
        return chineseScores;
    }

    public void setChineseScores(int chineseScores) {
        this.chineseScores = chineseScores;
        this.grade = chineseScores + mathScores + englishScores;
    }

    public int getMathScores() {
        return mathScores;
    }

    public void setMathScores(int mathScores) {
        this.mathScores = mathScores;
        this.grade = chineseScores + mathScores + englishScores;
    }

    public int getEnglishScores() {
        return englishScores;
    }

    public void setEnglishScores(int englishScores) {
        this.englishScores = englishScores;
        this.grade = chineseScores + mathScores + englishScores;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chineseScores=" + chineseScores +
                ", mathScores=" + mathScores +
                ", englishScores=" + englishScores +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.grade != o.grade) return o.grade - this.grade  ;
        if(this.chineseScores != o.chineseScores) return o.chineseScores - this.chineseScores;
        if(this.mathScores != o.mathScores) return o.mathScores - this.mathScores;
        if(this.englishScores != o.englishScores) return o.englishScores - this.englishScores;
        if(this.age != o.age) return o.age - this.age;
        if(this.name != o.name) return this.name.compareTo(o.name);
        return 0;
    }
}
