package Generics_Demo.Demo3;

/**
 * @Author HHH
 * @Date 2025/4/23 16:29
 * @Day Day27
 */


//泛型的继承和通配符
//泛型不具备继承性,但是数据具备继承性

//泛型不具备继承性
    //如果泛型方法需要传入的数据类型是一个泛型类,且为该泛型类指定了数据类型,就只能传入该类型的值,该类型的父子类也不行
    //例 public void addArrayList(ArrayList<String> list){}

//泛型的通配符
    //?也表示不确定的类型,但?可以进行类型的限定
        //1.? extends E    //表示可以传递E或者E所有的子类类型
        //1.? super E      //表示可以传递E或者E所有的父类类型
    //如果泛型方法需要传入的数据类型是一个泛型类,可以向泛型类中传入?,和单独写E效果一致,表示不确定的类型,且不用在前方定义
    //例 public <E> void addArrayList(ArrayList<E> list){}
    //例 public void addArrayList(ArrayList<?> list){}

    //public void addArrayList(ArrayList<? extends E> list){}   //表示可以传递E或者E所有的子类类型
    //public void addArrayList(ArrayList<? super E> list){}     //表示可以传递E或者E所有的父类类型
public class GenericsDemo3 {
}
