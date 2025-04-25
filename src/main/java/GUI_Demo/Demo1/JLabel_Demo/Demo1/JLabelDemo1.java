package GUI_Demo.Demo1.JLabel_Demo.Demo1;

import javax.swing.*; /**
 * @Author HHH
 * @Date 2025/4/10 12:31
//指定JLabel在JFrame中的位置(指定位置要在添加进窗口前指定)
//jLabel.setBounds(int X, int Y, int width, int height)     //坐标系,宽,高
 * @Day Day14
 */

//JLabel    管理文字和图片的容器
//Java中内置的Javabean类

//JLabel在JFrame中的位置用坐标来表示
//JLabel的左上角为定位点,JFrame的左上角为坐标原点
//向右为X轴,向左为Y轴

//在JLabel中添加图片的步骤
//  1.创建一个图片ImageIcon的对象
//      ImageIcon imageIcon = new ImageIcon(文件路径);
//  2.创建一个JLabel的对象(管理容器)
//      JLabel jLabel = new JLabel(imageIcon);
//  3.把管理容器添加进界面当中
//      jFrame.add(jLabel);

//ImageIcon 图片
//Java中内置的Javabean类
//ImageIcon的构造方法:
//  public ImageIcon(String filename){} //filename是文件的名字(路径)

//当多个图片位置重叠时,先加载的图片在上方,后加载的图片在下方

//给容器添加边框
//  public void setBorder(Border border);
//      Border是一个接口,需要传入一个接口的实现类,Border接口中的各种实现类是各式各样的边框
//  public void SetBorder(new BevelBorder(int bevelType));
//      给容器添加一个斜面边框,BevelBorder是一种斜面边框,需要传入参数0或1,代表斜面的方向
public class JLabelDemo1 {
}
