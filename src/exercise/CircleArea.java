package exercise;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/25/22:00
 * @Description:
 **/
/*
（1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
(2)定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义
如下：public void printAreas(exercise.Circle c, int time)
在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。 （3）在main方法中调用printAreas()方法，调
用完毕后输出当前半径值。
 */
public class CircleArea {
    public static void main(String[] args) {
           Circle circle=new Circle();
           new PassObject().printAreas(circle,5);
    }

}
class Circle{
    double radius;
    public double findArea(){
        return Math.PI*radius*radius;
    }
}
class PassObject{
    public void printAreas(Circle c, int time){
        System.out.println("radius\t\tArea");
        for (int i = 1; i <= time; i++) {
            c.radius=i;

            System.out.println(c.radius+"\t\t"+c.findArea());
    }
        System.out.println();
        System.out.println("now radius is :"+(c.radius+1));
}
}