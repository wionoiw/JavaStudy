package class_Demo.Test5;

/**
 * @Author HHH
 * @Date 2025/4/9 22:54
 * @Day Day13
 */
public class Outer {
    private int a = 10;

    class Inner {
        private int a = 20;

        public void show() {
            int a = 30;
            //Outer.this获取了外部类对象的地址值
            System.out.println(Outer.this.a); // 10
            System.out.println(this.a);//20
            System.out.println(a); // 30
        }
    }
}
