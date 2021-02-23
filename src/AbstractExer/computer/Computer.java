package AbstractExer.computer;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/23/18:33
 * @Description:
 **/
public class Computer {
    public static void main(String[] args) {

        computer1 computer1=new computer1();
        computer1.transferData(new Flash());
        computer1.transferData(new Printer());
    }
}
class computer1{
    public void transferData(USB usb){//USB usb = new Flash();//此处多态父类usb可调用flash重写过得方法
        usb.start();

        System.out.println("具体传输数据的细节");

        usb.stop();
    }
}



interface USB{
    void start();
    void stop();
}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘关闭工作");

    }
}
class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开启工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");

    }
}