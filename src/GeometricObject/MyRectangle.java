package GeometricObject;

import exercise.Person;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/1/17:13
 * @Description:
 **/
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;
    public MyRectangle(double width,double height,String color, double weight) {
        super(color, weight);
        this.height=height;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return height*width;
    }
}