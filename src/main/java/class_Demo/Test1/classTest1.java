//Day04
package class_Demo.Test1;
// 对象数组1
//需求:定义数组存储三个商品对象
//商品的属性:商品的id,名字,价格,库存
//创建三个商品对象,并把商品对象存入到数组当中
public class classTest1 {
    public static void main(String[] args){
        Product a1 = new Product(1,"张三",100.0,4);
        Product a2 = new Product(2,"李四",200.0,5);
        Product a3 = new Product(3,"王五",300.0,6);
        Product[] arr = {a1,a2,a3};
        bianLi(arr);

    }

//    //循环为数组赋值
//    public static Product[] fuZhi() {
//        for (int i = 0; i < arr.length; i++) {
//
//        }
//    }

    //遍历数组
    public static void bianLi(Product[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i].getId() +"\n"
                            +arr[i].getName() +"\n"
                            +arr[i].getPrice() +"\n"
                            +arr[i].getStock() +"\n\n"
               );
        }
    }
}
