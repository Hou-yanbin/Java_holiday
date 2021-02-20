package exercise;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/12/9:06
 * @Description:
 **/
public class MainTest {
    public static void main(String[] args) {
        for (int i=0;i<args.length;i++){
            System.out.println("******"+args[i]);
            int num =Integer.parseInt(args[i]);//把string类型强转为int
            System.out.println("&&&&&&"+args[i]);
        }
        person am = new person();

    }

}
class person{
    String im;
    static {
        System.out.println("I am jack hou!");
    }
}