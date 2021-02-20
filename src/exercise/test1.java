package exercise;

import java.sql.SQLOutput;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/3/17:44
 * @Description:
 **/
public class test1 {
    public static void main(String[] args) {
        float b1=1.1f;
        System.out.println(b1);
        Float b3=new Float(b1);
        System.out.println(b3.floatValue());
        System.out.println(b3.intValue());
        System.out.println(b3);
        Boolean b2 = new Boolean("TrUe");
        System.out.println(b2);
        test1 test1=new test1();
        test1 test2=new test1();
        int b=10;
        if (test1==test2){
            System.out.println("1");
        }else
            System.out.println("2");

    }

}

