package exercise;

import org.junit.Test;

import java.sql.SQLOutput;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/2/23:45
 * @Description:
 **/
public class WrapperTest {



//        int num1 = 10;
////		System.out.println(num1.toString());
//        Integer in1 = new Integer(num1);
//        System.out.println(in1.toString());
//
//        Integer in2 = new Integer("123");
//        System.out.println(in2.toString());
//
//        //报异常
////		Integer in3 = new Integer("123abc");
////		System.out.println(in3.toString());
//
//        Float f1 = new Float(12.3f);
//        Float f2 = new Float("12.3");
//        System.out.println(f1);
//        System.out.println(f2);
//
//        Boolean b1 = new Boolean(true);
//        Boolean b2 = new Boolean("TrUe");
//        System.out.println(b2);
//        Boolean b3 = new Boolean("true123");
//        System.out.println(b3);//false
//
//
//        Order order = new Order();
//        System.out.println(order.isMale);//false
//        System.out.println(order.isFemale);//null

        public void test5(){
            String str1 = "123";
            //错误的情况：
//		int num1 = (int)str1;
//		Integer in1 = (Integer)str1;
            //可能会报NumberFormatException
            int num2 = Integer.parseInt(str1);
            System.out.println(num2 + 1);

            String str2 = "true1";
            boolean b1 = Boolean.parseBoolean(str2);
            System.out.println(b1);
        }
    }


//class Order{
//
//    boolean isMale;
//    Boolean isFemale;
//}
