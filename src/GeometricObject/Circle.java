package GeometricObject;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/1/17:07
 * @Description:
 **/
public class Circle extends GeometricObject{
    private double radius;
    public Circle(double radius,String color, double weight) {
        super(color, weight);
        this.radius=radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI*radius*radius;
    }
}