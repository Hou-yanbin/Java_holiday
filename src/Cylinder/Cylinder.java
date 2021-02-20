package Cylinder;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/30/15:15
 * @Description:
 **/
public class Cylinder extends Circle{
    double length;


    public Cylinder() {
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double findVolume(){

        //return Math.PI*getRadious()*getRadious()*getLength();
        //或
        return findArea()*getLength();
    }
}