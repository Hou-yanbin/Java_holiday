package AbstractExer;

import javax.xml.bind.SchemaOutputResolver;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/20/14:52
 * @Description:
 **/
public class CommonEmployee extends Employee{

    public CommonEmployee() {

    }

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override//因为重写了父类的抽象方法work()所以CommonEmployee就不是抽象类了
    public void work() {
        System.out.println("员工在一线车间生产产品!");
    }
}