package GUI_Demo.Demo1.JFrame_Demo.Test1;

import GUI_Demo.Demo1.JFrame_Demo.Test1.UI.GameJFrame;
import GUI_Demo.Demo1.JFrame_Demo.Test1.UI.LoginJFrame;
import GUI_Demo.Demo1.JFrame_Demo.Test1.UI.RegisterFrame;

/**
 * @Author HHH
 * @Date 2025/4/10 11:22
 * @Day Day14
 */

//到idea中创建一个宽603像素，高680像素的游戏主界面
//到idea中创建一个宽488像素，高430像素的登录界面
//到idea中创建一个宽488像素，高500像素的注册界面
public class App {
    public static void main(String[] args){
        GameJFrame gameJFrame = new GameJFrame();
        new LoginJFrame();
        new RegisterFrame();
    }
}
