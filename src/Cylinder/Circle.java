package Cylinder;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/30/15:11
 * @Description:
 **/
public class Circle {
    private double radious;

    public Circle(){
        radious=1;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }
    public double findArea(){
        return Math.PI*getRadious()*getRadious();
    }
}