package GeometricObject.exer;

import org.junit.Test;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/2/17:46
 * @Description:
 **/
public class GeometricObject {
    protected String color;
    protected double weight;
    protected GeometricObject(){
        color="white";
        weight=1.0;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}