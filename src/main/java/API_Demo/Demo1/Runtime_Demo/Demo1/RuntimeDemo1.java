package API_Demo.Demo1.Runtime_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/14 15:50
 * @Day Day18
 */

//Runtime   表示当前虚拟机的运行环境
//Runtime类不是静态的,也不能new一个Runtime对象,仅能通过getRuntime()获取对象,并调用其方法
//public static Runtime getRuntime()        当前系统的运行环境对象
//public void exit(int status)              停止虚拟机
//public int availableProcessors()          获得CPU的线程数
//public long maxMemory()                   JVM能从系统中获取总内存大小(单位byte)
    //单位是字节,转化为kb需要除以1024,kb转化为mb需要除以1024,mb转化为Gb需要除以1024
//public long totalMemory()                 JVM已经从系统中获取总内存大小(单位byte)
//public Process exec(String command)       运行cmd命令
    //运行cmd命令
    //shutdown：关机
    //加上参数才能执行
    //-s：默认在1分钟之后关机
    //-s-t指定时间：指定关机时间
    //-a：取消关机操作
    //-r:关机并重启
public class RuntimeDemo1 {
}
