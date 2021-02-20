package exercise;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/23/22:18
 * @Description:
 **/
public class ClassObjects {
    public static void main(String[] args) {
/*
        Customer cust1 = new Customer();

        cust1.eat();

        //测试形参是否需要设置的问题
//		int[] arr = new int[]{3,4,5,2,5};
//		cust1.sort();

        cust1.sleep(8);
        cust1.getNation("china");
        System.out.println(cust1.getNation("china"));

    }
}

//客户类

class Customer{

    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("客户吃饭");
        return;
        //return后不可以声明表达式
//		System.out.println("hello");
    }

    public void sleep(int hour){
        System.out.println("休息了" + hour + "个小时");

        eat();
//		sleep(10);
    }

    public String getName(){

        if(age > 18){
            return name;

        }else{
            return "Tom";
        }
    }

    public String getNation(String nation){
        String info = "我的国籍是：" + nation;
        return info;
    }
*/
        //体会形参是否需要设置的问题
//	public void sort(int[] arr){
//
//	}
//	public void sort(){
//		int[] arr = new int[]{3,4,5,2,5,63,2,5};
//		//。。。。
//	}

//    public void info(){
        //错误的
//		public void swim(){
//
//		}
/*求圆的面积


exercise.Circle c1=new exercise.Circle();
c1.findAcre(3.4);


    }
}

class exercise.Circle{
    public void findAcre(double radius){
        double arce= Math.PI*radius*radius;
        System.out.println(arce);
    }
}
*/
        /*4. 对象数组题目：
定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一：打印出3年级(state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
         */
//         Student student=new Student();
//         student.findNumber();

//           //声明Student类型的数组
//        Student[] stus = new Student[20];  //String[] arr = new String[10];
//
//        for(int i = 0;i < stus.length;i++){
//            //给数组元素赋值
//            stus[i] = new Student();
//            //给Student对象的属性赋值
//            stus[i].number = (i + 1);
//            //年级：[1,6]
//            stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
//            //成绩：[0,100]
//            stus[i].score = (int)(Math.random() * (100 - 0 + 1));
//        }
//
//        //遍历学生数组
//        for(int i = 0;i <stus.length;i++){
////			System.out.println(stus[i].number + "," + stus[i].state
////					+ "," + stus[i].score);
//
//            System.out.println(stus[i].info());
//        }
//
//        System.out.println("********************");
//
//        //问题一：打印出3年级(state值为3）的学生信息。
//        for(int i = 0;i <stus.length;i++){
//            if(stus[i].state == 3){
//                System.out.println(stus[i].info());
//            }
//        }
//
//        System.out.println("********************");
//
//        //问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
//        for(int i = 0;i < stus.length - 1;i++){
//            for(int j = 0;j < stus.length - 1 - i;j++){
//                if(stus[j].score > stus[j + 1].score){
//                    //如果需要换序，交换的是数组的元素：Student对象！！！
//                    Student temp = stus[j];
//                    stus[j] = stus[j + 1];
//                    stus[j + 1] = temp;
//                }
//            }
//        }
//
//        //遍历学生数组
//        for(int i = 0;i <stus.length;i++){
//            System.out.println(stus[i].info());
//        }
//
//    }
//}
//class Student{
//    int number;//学号
//    int state;//年级
//    int score;//成绩
//
//    //显示学生信息的方法
//    public String info(){
//        return "学号：" + number + ",年级：" + state + ",成绩：" + score;
//    }
//
//}
//class Student{
//    //学号
//    int[] number=new int[20];
//    int[] state=new int[20];
//    int[] score=new int[20];
//    public void findNumber() {
//        int i = 0;
//        for (i = 0; i < 20; i++) {
//            number[i] = (i + 1);
//            state[i] = (int) (Math.random() * 6) + 1;
//            score[i] = (int) (Math.random() * 90) + 10;
//            // System.out.println("学号为: "+number[i]+"年级为: "+state[i]+"成绩为: "+score[i]);
//            if (state[i] == 3) {
//                System.out.println("学号为: " + number[i] + "年级为: " + state[i] + "成绩为: " + score[i]);
//            }
//        }
//        for (int j = 0; j < 19; j++) {
//            for (int l = 1; l < 19 - j; l++) {
//                if (score[l] > score[l + 1]) {
//                    int temp = score[l];
//                    score[l] = score[l - 1];
//                    score[l - 1] = temp;
//                    ;
//                }
//
//            }
//            System.out.println("学号为: " + number[i] + "年级为: " + state[i] + "成绩为: " + score[i]);
//
//
//        }
//        //年级
//    }
//}
//        exercise.ClassObjects test = new exercise.ClassObjects();
//        test.first();
//    }
//    public void first() {
//        int i = 5;
//        Value v = new Value();
//        v.i = 25;
//        second(v, i);
//        System.out.println(v.i);
//    }
//    public void second(Value v, int i) {
//        i = 0;
//        v.i = 20;
//        Value val = new Value();
//        v = val;
//        System.out.println(v.i + " " + i);
//    }
//    class Value {
//        int i = 15;

        int a=10;
        int b=10;
        method(a,b);
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
    public static void method(int a,int b) {
        a=a*10;
        b=b*20;
        System.out.println(a);
        System.out.println(b);
        System.exit(0);


    }
    }
