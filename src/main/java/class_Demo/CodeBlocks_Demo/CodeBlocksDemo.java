package class_Demo.CodeBlocks_Demo;

/**
 * @Author HHH
 * @Date 2025/4/9 11:55
 * @Day Day13
 */

//CodeBlocks    代码块

//代码块的分类:局部代码块,构造代码块,静态代码块

//局部代码块
//  提前结束变量的生命周期,释放内存空间(已淘汰)

//构造代码块
//  1.写在成员位置的代码块
//  2.作用,可以把多个构造方法中重复的代码抽取出来
//  3.执行时机,我们在创建本类对象的时候会先执行构造代码块再执行构造方法

//构造代码块的书写
//{
//语句体
//}

//构造代码块的弊端
//  不够灵活,如果有构造方法不想执行构造代码块无法做到,渐渐被淘汰了

//抽取构造方法中重复的代码,可以用以下两种方法
//  1.使用一个构造方法调用另一个构造方法
//      public Student(){
//          this.(null,0);
//      }
//      public Student(String name, int age){
//          System.out.println("正在新建学生");
//          this.nane = name;
//          this.age = age;
//      }
//  2.将共有的代码抽取出来写一个方法
//      public Student(){
//          调用方法();
//      }
//      public Student(String name, int age){
//          调用方法();
//          this.nane = name;
//          this.age = age;
//      }

//静态代码块
//需要通过static关键字修饰,随着类的加载而加载,并且自动触发,只执行一次

//用于某些方法的数据初始化,只执行一次,可以防止方法被反复调用占用太多内存

//静态代码块的书写
//static {
//语句体
//}
public class CodeBlocksDemo {
}
