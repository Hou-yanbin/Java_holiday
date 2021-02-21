package AbstractExer.exer1;

import GeometricObject.MyRectangle;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/21/14:26
 * @Description:（5）定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各
 * 类雇员对象的引用。利用循环结构遍历数组元素，输出各个对象的类型,name,number,birthday。
 * 当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 **/
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int month=scanner.nextInt();
        Employee[] employees= new Employee[2]; //此时是声明了Employee类型的数组,不是newEmployee的对象,所以作为抽象类的Employee可以这样来创建Employee变量数组并初始化
        employees[0] =new SalariedEmployee("Jack",1,new MyDate(2016,5,21),8888);
        employees[1] =new HourlyEmployee("Tom",2,new MyDate(2006,6,15),66,300);
        for (int i=0;i<employees.length;i++){
            if (month==employees[i].getBirthday().getMonth()){
                double luncksalary=employees[i].earnings()+666;
                System.out.println("本月是:"+employees[i].getName()+"的生日,获得666红包,奖后工资为:"+luncksalary);
            }
        }
        for (int i=0;i<employees.length;i++){
            System.out.println(employees[i].toString());
            double salary=employees[i].earnings();
            System.out.println("月工资为: "+salary);
        }

    }

}