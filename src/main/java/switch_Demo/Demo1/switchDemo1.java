//Day02
package switch_Demo.Demo1;
//switch    选择语句
public class switchDemo1 {
    public static void main(String[] args){
        String noodles = "鲜虾鱼板面";
        //switch括号内输入表达式(要匹配的值)，取值为byte,short,char,intmlong,String
        switch(noodles){
            //匹配case后的值，若为false,则执行;
            // case后的值不能是表达式;
            // case后只能是字面量，不能写变量
            case "红烧牛肉面" :
                System.out.println("吃了红烧牛肉面");
                break;
            case "老坛酸菜面" :
                System.out.println("吃了老坛酸菜面");
                break;
            case "老母鸡汤面" :
                System.out.println("吃了老母鸡汤面");
                break;
            //当全部不匹配时，默认选项default
            default:
                System.out.println("想吃的面这里没有,什么也没吃");
                break;
        }
//        jdk12新特性
//        switch(noodles){
//            case "红烧牛肉面" -> {
//                System.out.println("吃了红烧牛肉面");
//            }
//            case "老坛酸菜面" -> {
//                System.out.println("吃了老坛酸菜面");
//            }
//            case "老母鸡汤面" -> {
//                System.out.println("吃了老母鸡汤面");
//            }
//            default -> {
//                System.out.println("想吃的面这里没有,什么也没吃");
//            }
//        }

    }
}
