package AbstractExer.exer1;

import java.util.Set;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/21/12:44
 * @Description:
 * （3）定义SalariedEmployee类继承Employee类，实现按月计算工资的员工处
 * 理。该类包括：private成员变量monthlySalary；
 * 实现父类的抽象方法earnings(),该方法返回monthlySalary值；toString()方法输
 * 出员工类型信息及员工的name，number,birthday
 **/
public class SalariedEmployee extends Employee  { //Employee中没有空参构造器而SalariedEmployee又默认调用super(空);所以直接提供构造器

    private double monthlySalary;
    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    public String toString(){
        return "SalariedEmployee"+super.toString();
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary=monthlySalary;
    }
}