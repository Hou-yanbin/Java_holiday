package AbstractExer;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/20/15:04
 * @Description:
 **/
/*
请使用继承的思想，设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问
 */
public class EmployeeTest {
    public static void main(String[] args) {
        CommonEmployee commonEmployee=new CommonEmployee("jack",11,4152);
        commonEmployee.work();
        Manager manager =new Manager("Jack",1112,88888,66666);
        //多态
        Employee manager1 =new Manager("Tom",12,888,666);
        manager1.work();
        manager.work();

    }
}