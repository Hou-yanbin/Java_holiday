package AbstractExer.computer;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/23/19:57
 * @Description:
 **/
public class NetWorkTest {
    public static void main(String[] args) {
        Server server=new Server();
        ProxyServer proxyServer = new ProxyServer(new Server());
        proxyServer.browse();

    }
}
interface NetWork{
    public void browse();
}
//被代理类
class Server implements NetWork{
    public void browse(){
        System.out.println("真实的服务器访问网络");
    }
}
//代理类
class ProxyServer implements NetWork{
    private NetWork work;
    public ProxyServer(NetWork work){
        this.work=work;

    }
    public void check(){
        System.out.println("联网之前的检查工作");
    }
    public void browse(){
        check();
        work.browse();
    }
}
