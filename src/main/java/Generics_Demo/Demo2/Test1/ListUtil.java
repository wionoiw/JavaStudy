package Generics_Demo.Demo2.Test1;

import java.util.ArrayList;

/**
 * @Author HHH
 * @Date 2025/4/23 15:59
 * @Day Day27
 */
public class ListUtil {
    private ListUtil(){}

    //E...e中的e实际上是一个数组,允许传递零个或多个参数,并且在方法内部,它会被当成一个数组使用
    public static <E> void addAll(ArrayList<E> list, E...e){
        //普通for循环
        for (int i = 0; i < e.length; i++) {
            list.add(e[i]);
        }

//        //增强for循环
//        for (E e1 : e) {
//            list.add(e1);
//        }
    }
}
