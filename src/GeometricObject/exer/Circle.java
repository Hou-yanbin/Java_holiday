package GeometricObject.exer;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.Objects;
import java.util.Random;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/2/17:55
 * @Description:
 **/
public class Circle extends GeometricObject{
    private double radius;
    public Circle(){
        super();
        radius=1.0;
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //求圆的面积
    public double findArea(double radius){
        return Math.PI*radius*radius;
    }
    // 简单重写equals用来比较两个圆的半径radius是否相等，如相等，返回true。
    public boolean equals(Object obj){
        if (obj==this){
            return true;
        }
        if (obj instanceof Circle){//判断obj是否是Circle的实例
            Circle circle=(Circle)obj;
            return this.radius==circle.radius;
        }
        return false;
    }


//    @Override   //也可使用系统自动生成的比较半径radius的equals方法,也可自己简单重写,熟悉equals原理
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Circle)) return false;
//        Circle circle = (Circle) o;
//        return Double.compare(circle.getRadius(), getRadius()) == 0;
//    }

    @Override
    public String toString() {
        return "{ radius=" + radius + " }";
    }
}