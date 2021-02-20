package GeometricObject.exer;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/3/1:04
 * @Description:
 **/
public class GeometricObjectTest {
    public static void main(String[] args) {
        //Circle circle6=new Circle(2.0);//这样定义初始化此时color和weight为GeometricObject中的默认值
        Circle circle=new Circle("white",1.0,2.0);
        Circle circle1=new Circle("black",1.0,3.0);
        Circle circle2=new Circle("white",1.0,3.0);
        System.out.println("circle和circle1两个圆的颜色是否相同: "+circle.getColor().equals(circle1.getColor()));//此时调用java.lang.String包下的默认equals方法
        System.out.println("circle和circle2两个圆的颜色是否相同: "+circle.getColor().equals(circle2.getColor()));//此时调用java.lang.String包下的默认equals方法
        System.out.println("circle和circle2两个圆的半径是否相同: "+circle.equals(circle2));//此时调用Circle类中重写的equals方法
        System.out.println("circle半径为: "+circle.toString());//调用为Circle重写的toString()方法
        System.out.println("circle1半径为: "+circle1.toString());
        System.out.println("circle2半径为: "+circle2.toString());

    }
}