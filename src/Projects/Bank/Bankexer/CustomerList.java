package Projects.Bank.Bankexer;

import javax.print.attribute.standard.ColorSupported;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/31/20:46
 * @Description:
 **/
public class CustomerList {
    private Customer[] customers;
    int total=0;
    /*
   构造器，用来初始化customers数组
   totalCustomer：totalCustomer：指定customers数组的最大值
    */
    public CustomerList(int totalCustomer){
        customers=new Customer[totalCustomer];

    }
    /*
    用途：将参数customer添加到数组中最后一个客户对象记录之后
    参数：customer指定要添加的客户对象
    返回：添加成功返回true；false表示数组已满，无法添加
     */
    public boolean addCustomer(Customer customer){
       if (total>=customers.length) {
           return false;
       }
//           customers[total]=customer;
//           total++;

             customers[total++]=customer;
             return true;

    }
    /*
    修改指定客户的信息
     */
    public boolean replaceCustomer(int index,Customer cust){
        if (index<0||index>=total){
            return false;
        }else {
            customers[index]=cust;
            return true;
        }

    }
    public boolean deleteCustomer(int index){
        if (index<0||index>=total){
            return false;
        }else {
            for (int i=index;i<total-1;i++){
                customers[i]=customers[i+1];

            }
//            customers[total-1]=null;
//            total--;
            //或
            customers[--total]=null;
            return true;
        }
    }
    public Customer[] getAllCustomers(){//获取客户信息
        Customer[] customers1=new Customer[total];  //创建新的数组对象来接收customer的客户数据,返回customers1数组对象
        for (int i=0;i<total;i++){//i<total不是i<total-1这样当初始i=0时,total等于1时直接跳出无法获得数组客户信息
            customers1[i]=customers[i];
        }
        return customers1;

    }
    /*
    用途：返回参数index指定索引位置的客户对象记录
    参数： index指定所要获取的客户在数组中的索引位置，从0开始
    返回：封装了客户信息的Customer对象,若没有返回null
     */
    public Customer getCustomer(int index){
        if (index<0||index>=total){
            return null;
        }else {
//            Customer[] customers1 = new Customer[total]; //此时不需要new新对象接收,只取一个没必要
//            for (int i = 0; i < total - 1; i++) {
//                customers1[i] = customers[i];
//            }
            return customers[index];
        }
    }
    /*
    获取客户数量
     */
    public int getTotal(){
        return total;
    }

}