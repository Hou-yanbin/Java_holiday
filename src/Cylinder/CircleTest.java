package Cylinder;

import javax.swing.*;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/30/15:25
 * @Description:
 **/
public class CircleTest extends Cylinder{
    public static void main(String[] args) {
        CircleTest circleTest=new CircleTest();
        circleTest.setRadious(2);
        circleTest.setLength(3);
        double volume=circleTest.findVolume();
        System.out.println(volume);
        System.out.println(Math.PI*4*3);
    }


}