import java.util.*;

/**
 * @Author HHH
 * @Date 2025/4/22 22:50
 * @Day Day26
 */
public class Test {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<String,String>();
        m.put("尹志平","小龙女");
        m.put("郭靖","穆念慈");
        m.put("欧阳克","黄蓉");
//        traverse1_1(m);
//        traverse1_2(m);
//        traverse1_3(m);
        traverse2_1(m);
        traverse2_2(m);
        traverse2_3(m);
    }

    //利用键找值的方式遍历map集合   //要求：装着键的单列集合使用增强for的形式进行遍历
    public static void traverse1_1(Map<String,String> m) {
        Set<String> keys = m.keySet();
        for(String key : keys)  System.out.println(key + ":" + m.get(key));
    }

    //利用键找值的方式遍历map集合   //要求：装着键的单列集合使用迭代器的形式进行遍历
    public static void traverse1_2(Map<String,String> m) {
        Set<String> keys = m.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println( key + ":" + m.get(key));
        }
    }

    //利用键找值的方式遍历map集合   //要求：装着键的单列集合使用lambda表达式的形式进行遍历
    public static void traverse1_3(Map<String,String> m) {
        Set<String> keys = m.keySet();
        keys.forEach(o -> System.out.println(o + ":" + m.get(o)));
    }

    //通过键值对对象进行遍历map集合， //要求：装着键值对对象的单列集合使用增强for的形式进行遍历
    public static void traverse2_1(Map<String,String> m) {
        Set<Map.Entry<String,String>> entrys = m.entrySet();
        for(Map.Entry<String,String> entry:entrys)  System.out.println(entry.getKey()+":"+entry.getValue());
    }

    //通过键值对对象进行遍历map集合， //要求：装着键值对对象的单列集合使用迭代器的形式进行遍历
    public static void traverse2_2(Map<String,String> m) {
        Set<Map.Entry<String,String>> entrys = m.entrySet();
        Iterator<Map.Entry<String,String>> it = entrys.iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    //通过键值对对象进行遍历map集合， //要求：装着键值对对象的单列集合使用lambda表达式的形式进行遍历
    public static void traverse2_3(Map<String,String> m) {
        Set<Map.Entry<String,String>> entrys = m.entrySet();
        entrys.forEach(o -> System.out.println(o.getKey()+ ":"+ o.getValue()));
    }
}
