package exercise;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/26/18:15
 * @Description:
 **/
/*
 输入一个数据n，计算斐波那契数列(exercise.Fibonacci)的第n个值
1 1 2 3 5 8 13 21 34 55
规律：一个数等于前两个数之和
要求：计算斐波那契数列(exercise.Fibonacci)的第n个值，并将整个数列打印出来
*/
public class Fibonacci {
    public static int getNum(int n) {

        if (n == 0) {
            return 0;
        } else if (n ==1) {
            return 1;
        } else {
            return getNum(n - 2) + getNum(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("请输入斐波那契的位数:"+"\t");
        int num=scan.nextInt();
        for (int i=0;i<num;i++){
        System.out.print(getNum(i)+"\t");

        }
        System.out.println();
        System.out.println((int)'\t');
    }
}


//public class exercise.Fibonacci {
//
//    //建立一个函数，用于计算数列中的每一项
//    public static int fib(int num) {
//        //判断：是否是第一个数和第二个数
//        if(num == 1 || num == 2) {
//            return 1;
//        }else {
//            //循环调用本函数
//            return fib(num - 2) + fib(num - 1);
//        }
//    }
//
//    //主函数（程序入口）
//    public static void main(String[] args) {
//
//        //建立一个for循环，用于打印第一个至第十个数字
//        for(int i = 1;i <= 10;i++) {
//            //调用函数进行打印
//            System.out.print(fib(i) + "\t");
//        }
//    }
//
//}