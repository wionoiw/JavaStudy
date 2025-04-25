package extends_Demo.Test3;

/**
 * @Author HHH
 * @Date 2025/4/8 9:23
 * @Day Day12
 */
//员工(Employee)
public class Employee {
    private String id;
    private String name;
    private String work;

    //工作
    public void working(){
        System.out.println(this.getName() + "正在" + work);
    }

    public Employee() {
    }

    public Employee(String id, String name,String work) {
        this.id = id;
        this.name = name;
        this.work = work;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
