package exercise;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/18/15:47
 * @Description:
 **/
public class Array {
    public static void main(String[] args) {
//        int[] arr = new int[4];
//        for(int i = 0;i < arr.length;i++){
//            arr[i]=i;
//            System.out.println(arr[i]);
//        }
//       /* 2. 从键盘读入学生成绩，找出最高分，
//            并输出学生成绩等级。
//            成绩>=最高分-10 等级为’A’
//            成绩>=最高分-20 等级为’B’
//            成绩>=最高分-30 等级为’C’
//            其余 等级为’D’
//        提示：先读入学生人数，根据人数创建int数组，
//        存放学生成绩。
//        */
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入学生的人数:");
//        int num =scanner.nextInt();
//        int[] score=new int[num];
//        int maxScore=0;
//        for (int i=0;i<score.length;i++){
//            System.out.println("请输入第"+(i+1)+"个人的成绩: ");
//            //int score1=scanner.nextInt();
//            //score[i]=score1;
//            score[i]=scanner.nextInt();//可直接接收
//
//        }
//        for (int i=0;i<score.length;i++){
//            if (maxScore<score[i]){
//                maxScore=score[i];
//            }
//        }
//        System.out.println("最大值为: "+maxScore);
//        for (int i=0;i<score.length;i++){
//            if (score[i]>=(maxScore-10)){
//                System.out.println("学生成绩为:"+score[i]+"等级为: A");
//            }
//            else if (score[i]>=(maxScore-20)){
//                System.out.println("学生成绩为:"+score[i]+"等级为: B");
//            }
//            else if (score[i]>=(maxScore-30)){
//                System.out.println("学生成绩为:"+score[i]+"等级为: C");
//            }
//            else {
//                System.out.println("学生成绩为:"+score[i]+"等级为: D");
//            }
//        }

        /*
         * 算法的考查：求数值型数组中元素的最大值、最小值、平均数、总和等
         *
         * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
         * 然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
         * 要求：所有随机数都是两位数。
         *
         * [10,99]
         * 公式：(int)(Math.random() * (99 - 10 + 1) + 10)
         *
         */

//        int[] arr=new int[10];
//        for (int i=0; i<10;i++){
//            arr[i]=(int)(Math.random()*90+10);
//        }
//        //遍历一下
//        for (int i=0;i<10;i++){
//            System.out.print(arr[i]+"\t");
//        }
//        System.out.println();
//
//        int maxValue=arr[0];
//        for (int i=0;i<10;i++){
//            if (maxValue<arr[i]){
//                maxValue=arr[i];
//            }
//        }
//        System.out.println("最大值为:"+maxValue);
//        int minValue=arr[0];//求最小值时不能赋值为0,否则一直是0
//        for (int i=0;i<10;i++){
//            if (minValue>arr[i]){
//                minValue=arr[i];
//            }
//        }
//        System.out.println("最大值为:"+minValue);
//        int sum=0;
//        for (int i=0; i<10;i++){
//            arr[i]=(int)(Math.random()*90+10);
//            sum+=arr[i];
//        }
//        System.out.println("总和为:"+sum);
//        System.out.println("平均值为:"+sum/arr.length);
//
        int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("冒泡排序: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        int[] arr1 = new int[]{43,32,76,-98,0,64,33,-21,32,99};

        //冒泡排序
        for(int i = 0;i < arr1.length - 1;i++){

            for(int j = 0;j < arr1.length - 1 - i;j++){

                if(arr1[j] > arr1[j + 1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }

            }

        }


        for(int i = 0;i < arr1.length;i++){
            System.out.print(arr1[i] + "\t");
        }

    }

}