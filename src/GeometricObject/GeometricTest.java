package GeometricObject;

import java.lang.reflect.GenericArrayType;
import java.time.chrono.IsoChronology;
import java.util.TreeMap;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/1/17:18
 * @Description:
 **/
/*
 * 定义一个测试类GeometricTest，
 * 编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型，利用动态绑定技术），
 * 编写displayGeometricObject方法显示对象的面积（注意方法的参数类型，利用动态绑定技术）。
 *
 */
public class GeometricTest {

    public static void main(String[] args) {

        GeometricTest geometricTest=new GeometricTest();
        Circle circle=new Circle(2,"white",1.0);
        Circle circle1=new Circle(3,"white",1.0);
        boolean isEquals = geometricTest.equalsArea(circle,circle1);
        System.out.println(isEquals);
        MyRectangle myRectangle= new MyRectangle(2,3,"black",1.0);
        System.out.println(geometricTest.displayGeometricObject(myRectangle));
    }
    public double displayGeometricObject(GeometricObject o) {//GeometricObject o = new Circle(...)
        return o.findArea();
    }

    public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
        return o1.findArea() == o2.findArea();
    }
}