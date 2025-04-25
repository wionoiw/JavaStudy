package class_Demo.Test5;

/**
 * @Author HHH
 * @Date 2025/4/9 22:51
 * @Day Day13
 */

//需求:编写代码,使输出语句分别输出10,20,30
//class outer {
//    private int a = 10;
//
//    class Inner {
//        private int a = 20;
//
//        public void show() {
//            int a = 30;
//            System.out.println( ??); // 10
//            System.out.println( ??);//20
//            System.out.println( ??); // 30
//        }
//    }
//}

public class classTest5 {
    public static void main(String[] args){
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
