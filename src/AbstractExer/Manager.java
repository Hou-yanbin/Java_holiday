package AbstractExer;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/20/14:42
 * @Description:
 **/
/*
对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
 */
public class Manager extends Employee{
    private double bouns;//奖金

    public Manager(double bouns) {
        this.bouns = bouns;
    }

    public Manager(String name, int id, double salary, double bouns) {
        super(name, id, salary);
        this.bouns = bouns;
    }

    @Override//因为父类Employee存在抽象方法work()需要重写,否则Manager类报错//因为重写了父类的抽象方法work()所以Manager就不是抽象类了
    public void work() {
        System.out.println("管理员工");
    }
}