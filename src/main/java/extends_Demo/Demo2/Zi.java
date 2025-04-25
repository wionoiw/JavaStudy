package extends_Demo.Demo2;

/**
 * @Author HHH
 * @Date 2025/4/7 17:16
 * @Day Day11
 */

class Zi extends Fu {
    String name = "zi";
    String drink = "喝水";

    public void show() {
        //打印zi
        System.out.println(name);
        System.out.println(this.name);
        //打印fu
        System.out.println(super.name);
        //打印喝水
        System.out.println(drink);
        System.out.println(this.drink);
        //打印吃东西
        System.out.println(eat);
        System.out.println(this.eat);
        System.out.println(super.eat);
    }
}