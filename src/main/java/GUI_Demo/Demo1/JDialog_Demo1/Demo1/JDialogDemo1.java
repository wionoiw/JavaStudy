package GUI_Demo.Demo1.JDialog_Demo1.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/11 18:49
 * @Day Day15
 */

//JDialog 弹框对象
//Java中内置的Javabean类

//在JDialog中添加图片和文字的步骤
//  1.创建一个JDialog的对象
////      JDialog jDialog = new JDialog();
//  2.创建一个JLabel的对象(管理容器),并添加内容
//      JLabel jLabel = new JLabel(imageIcon);
//  3.把管理容器添加进弹框当中
//     jDialog.getContentPane().add(jLabel);

//常用成员方法
//  public void setSize(int width, int height)       //设置宽和高,单位是像素
//  public void setTitle(String Title)               //设置弹框的标题
//  public void setAlwaysOnTop(boolean alwaysOnTop)  //设置弹框置顶,false取消置顶,true打开置顶
//  public void setLocationRelativeTo(Component c)   //传入null,使弹框居中
//  public void setModal(boolean modal)               //传入true,使弹框不关闭则无法操作下面的界面
//  public void setVisible(boolean b)                //控制弹框的显示,false关闭,true打开   //建议写到最后
public class JDialogDemo1 {
}
