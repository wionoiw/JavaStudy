package extends_Demo.Test1;

/**
 * @Author HHH
 * @Date 2025/4/7 22:17
 * @Day Day11
 */

//需求:现在有三种动物:哈士奇,沙皮狗,中华田园犬
//  暂时不考虑属性,仅考虑行为
//  请按照继承的思想特点进行继承体系的设计

public class extendsTest1 {
    public static void main(String[] args){
        //创建中华田园犬
        ChinesePastoral chinaDog = new ChinesePastoral();
        chinaDog.eat();
        //创建哈士奇
        Husky husky = new Husky();
        husky.teardown();
        husky.eat();
        //创建沙皮狗
        ShariPei shariPei = new ShariPei();
        shariPei.eat();
    }
}
