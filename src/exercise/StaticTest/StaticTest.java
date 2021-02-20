package exercise.StaticTest;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.concurrent.ForkJoinPool;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/5/20:42
 * @Description:
 **/
public class StaticTest {
        public static void main(String[] args) {

            Circle c1 = new Circle();

            Circle c2 = new Circle();

            Circle c3 = new Circle(3.4);
            System.out.println("c1的id：" + c1.getId() );
            System.out.println("c2的id：" + c2.getId() );
            System.out.println("c3的id：" + c3.getId() );

            System.out.println("创建的圆的个数为：" + Circle.getTotal());

        }
    }


    class Circle{

        private double radius;
        private int id;//自动赋值

        public Circle(){
            id = init++;
            total++;
        }

        public Circle(double radius){
            this();
//		id = init++;
//		total++;
            this.radius = radius;

        }

        private static int total;//记录创建的圆的个数
        private static int init = 1001;//static声明的属性被所有对象所共享

        public double findArea(){
            return 3.14 * radius * radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public int getId() {
            return id;
        }

        public static int getTotal() {
            return total;
        }
        int n;
        int[][] arr =new int[n][];


    }
