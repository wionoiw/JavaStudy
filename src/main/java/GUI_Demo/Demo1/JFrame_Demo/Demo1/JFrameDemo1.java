package GUI_Demo.Demo1.JFrame_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/10 12:02
 * @Day Day14
 */

//JFrame 组件外层窗体
//Java中内置的Javabean类

//JFrame窗口容器(即除了标题和菜单栏的显示页面)内部页面布局默认为居中
//可以通过setLayout()来进行修改

//常用成员方法
//  public void setSize(int width, int height)       //设置宽和高,单位是像素
//  public void setVisible(boolean b)                //控制界面的显示,false关闭,true打开   //建议写到最后
//  public void setTitle(String Title)               //设置界面的标题
//  public void setAlwaysOnTop(boolean alwaysOnTop)  //设置界面置顶,false取消置顶,true打开置顶
//  public void setLocationRelativeTo(Component c)   //传入null,设置界面居中
//  public void setJMenuBer(JMenuBer menuBer)        //给页面添加菜单
//  public void setJMenuBar()                        //添加菜单
//  public void setLayout(LayoutManager manager)     //修改窗口容器的页面布局(传入null则使页面布局为空)
//  public void getContentPane()                     //获取窗口容器
//  public void getContentPane().removeALL()         //清空窗口容器
//  public void getContentPane().repaint();         //刷新窗口容器
//  private void revalidate()                        //重新计算布局,当容器中的组件被动态修改时revalidate()重新计算所有组件的位置和大小
//  private void repaint()                      //重绘组件：强制重新绘制界面,会清除当前显示的内容，并根据最新状态重新绘制所有可见组件。
//  public void setDefaultCloseOperation(int operation)//设置关闭模式
//      operation == 0;         //点击关闭时什么都不做
//      operation == 1;         //hide-window默认窗口关闭操作
//      operation == 2;         //当Java虚拟机(VM)中的最后一个可显示窗口被处理掉时，VM可能会终止
//      operation == 3;         //关闭任意一个可显示窗口,都会使VM终止
public class JFrameDemo1 {
}
