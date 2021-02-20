package AbstractExer;

import javafx.concurrent.Worker;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/20/14:34
 * @Description:
 **/
/*
编写一个Employee类，声明为抽象类，
包含如下三个属性：name，id，salary。
提供必要的构造器和抽象方法：work()。
 */
abstract class Employee {
  private String name;
  private int id;
  private double salary;
  public Employee(){

  }
  public Employee(String name, int id, double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }
  public abstract void work();
}