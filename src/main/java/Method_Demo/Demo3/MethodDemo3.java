package Method_Demo.Demo3;

/**
 * @Author HHH
 * @Date 2025/4/22 18:01
 * @Day Day26
 */

//在调用方法的时候，如果方法出现了重载现象
//优先调用，实参跟形参类型一致的那个方法
    //例如
        //ArrayList<Integer> list = new ArrayList<>();
        //list.remove(1);
        //因为list有两个remove()方法,public E remove(int index)和public E remove(Object o)
        //优先调用实参与形参类型一致的方法
        //如果要调用remove(Object o),可以list.remove((Integer)1)或list.remove(new Integer(1))

public class MethodDemo3 {
}
