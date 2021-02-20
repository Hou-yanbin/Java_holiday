package exercise;

import com.sun.corba.se.impl.orbutil.ObjectStreamClassUtil_1_3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Day01 {
    public static void main(String[] args) {
      /*
        System.out.println("hello world!");
        boolean isMarried = true;
        if(isMarried){
            System.out.println("你就不能参加\"单身\"party了！\\n很遗憾");
        }else{
            System.out.println("你可以多谈谈女朋友！");
        }
        String a= 3.5f + "";
        System.out.println(a);
        /**
        练习：随意给出一个三位数的整数，打印显示它的个位数，十位数，百位数的值。
        格式如下：
        数字xxx的情况如下：
        个位数：
        十位数：
        百位数：

        例如：
        数字153的情况如下：
        个位数：3
        十位数：5
        百位数：1
         */
        /*
        int a1=187;
        System.out.println("百位数："+a1/100);
        System.out.println("十位数："+a1/10%10);
        System.out.println("个位数："+a1%10);
        int x= 1,y=1;
        if (x++==2&& ++y==2){
            x=7;
        }
        System.out.println("x="+x+",y="+y);
        */
        /*

/**
岳小鹏参加Java考试，他和父亲岳不群达成承诺：
如果：
成绩为100分时，奖励一辆BMW；
成绩为(80，99]时，奖励一台iphone xs max；
当成绩为[60,80]时，奖励一个 iPad；
其它时，什么奖励也没有。
请从键盘输入岳小鹏的期末成绩，并加以判断
*/
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("请输入成绩:");
//        int score=scanner.nextInt();
//        if (score==100){
//            System.out.println("BWM");
//        }
//        else if (score>80&&score<=99){
//            System.out.println("ipone XS MAX");
//        }
//        else if (score>=60&&score<=80){
//            System.out.println("ipad");
//        }
//        else {
//            System.out.println("什么也没有!");
//        }
/*
编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，
对它们进行排序(使用 if-else if-else),并且从小到大输出。

 */
//        Scanner scanner =new Scanner(System.in);
//        int num1=scanner.nextInt();
//        int num2=scanner.nextInt();
//        int num3=scanner.nextInt();
//        if(num1 >= num2){
//            if(num3 >= num1)
//                System.out.println(num2 + "," + num1 + "," + num3);
//            else if(num3 <= num2)
//                System.out.println(num3 + "," + num2 + "," + num1);
//            else
//                System.out.println(num2 + "," + num3 + "," + num1);
//
//
//        }else{
//            if(num3 >= num2)
//                System.out.println(num1 + "," + num2 + "," + num3);
//            else if(num3 <= num1)
//                System.out.println(num3 + "," + num1 + "," + num2);
//            else
//                System.out.println(num1 + "," + num3 + "," + num2);
//
//        }
/*
        假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入
        一个两位数，然后按照下面的规则判定用户是否能赢。
        1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
        2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
        3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
        4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
        5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
        提示：使用(int)(Math.random() * 90 + 10)产生随机数。
        Math.random() : [0,1) * 90 [0,90) + 10 [10,100)  [10,99]
        //公式：[a,b]  :  (int)(Math.random() * (b - a + 1) )+ a

 */
        Scanner scanner= new Scanner(System.in);
        System.out.print("请输入两位彩票号码: ");
        int num1 =(int)(Math.random()*90)+10;
        //System.out.println(num1);
        while (true) {
            int num = scanner.nextInt();
            if (num/100!=0&&num%10!=0){
                System.out.println("请重新输入!");
                continue;
            }

            if (num == num1) {
                System.out.println("奖励100000");

            } else if (num % 10 == num1 / 10 && num / 10 == num1 % 10) {
                System.out.println("奖励3000");
            } else if (num / 10 == num1 / 10 || num % 10 == num1 % 10) {
                System.out.println("奖励1000");
            } else if (num / 10 == num1 % 10 || num % 10 == num1 / 10) {
                System.out.println("奖励500");
            } else {
                System.out.println("彩票作废!");
            }
        }

        /*
题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
比如：12和20的最大公约数是4，最小公倍数是60。

说明：break关键字的使用：一旦在循环中执行到break，就跳出循环

*/
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("请输入第一个正整数：");
//        int m = scan.nextInt();
//
//        System.out.println("请输入第二个正整数：");
//        int n = scan.nextInt();
//
//        //获取最大公约数
//        //1.获取两个数中的较小值
//        int min = (m <= n)? m : n;
//        //2.遍历
//        for(int i = min;i >= 1 ;i--){
//            if(m % i == 0 && n % i == 0){
//                System.out.println("最大公约数为：" + i);
//                break;//一旦在循环中执行到break，就跳出循环
//            }
//        }
//
//        //获取最小公倍数
//        //1.获取两个数中的较大值
//        int max = (m >= n)? m : n;
//        //2.遍历
//        for(int i = max;i <= m * n;i++){
//            if(i % m == 0 && i % n == 0){
//
//                System.out.println("最小公倍数：" + i);
//                break;
//
//            }
//        }
       /*
        3.输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数
        字立方和等于其本身。
        例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
        */

//        for (int i=100;i<1000;i++){
//            int a=(i/100)*(i/100)*(i/100);
//            int b=(i/10%10)*(i/10%10)*(i/10%10);
//            int c=(i%10)*(i%10)*(i%10);
//            if (i==a+b+c){
//                System.out.println("水仙花数:"+i);
//            }
//        }
//        for(int i=1;i<10;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(i+"*"+j+"="+(i*j)+"\t");
//            }
//            System.out.println();
//        }

        }
    }
