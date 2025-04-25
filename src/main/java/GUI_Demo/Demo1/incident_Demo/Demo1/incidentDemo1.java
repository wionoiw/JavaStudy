package GUI_Demo.Demo1.incident_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/10 13:32
 * @Day Day14
 */

//为窗口页面添加时间的步骤
//  1.创建事件源
//  2.为事件源绑定监听
//  3.将事件源添加进窗口页面

//事件
//  事件源:按钮、图片、窗体...
//  事件:某些操作 (如:鼠标单击、鼠标划入)
//  绑定监听:当事件源上发生了每个事件,则执行某段代码
//      KeyListener         键盘监听(可以监听几乎键盘的所有按键)
//      MouseListener       鼠标监听(可以监听鼠标按下不松或者松开等操作)
//      ActionListener      动作监听(键盘监听和鼠标监听的精简版,只能监听鼠标的点击或者键盘的空格)

//JButton 按钮
//Java中内置的Javabean类

//JButton类的常用成员方法
//public void setBounds(int X, int y,int width, int height)     //设置宽高和位置
//public void setSize(int width, int height)                    //设置宽高
//public void setLocation(int X ,int Y)                         //设置位置
//public void addActionListener(ActionListener 1)
//  //添加动作监听,ActionListener是一个接口,传入的参数是ActionListener接口的实现类对象,重写的方法即为触发监听后要执行的代码

//public void addActionListener(ActionListener 1)


//ActionListener接口需要重写的抽象类
//@Override
//public void actionPerformed(ActionEvent e){
//  //获取被操作的那个事件源对象,并用Object类的source对象接收
//  Object source = e.getSource()
//}
public class incidentDemo1 {
}
