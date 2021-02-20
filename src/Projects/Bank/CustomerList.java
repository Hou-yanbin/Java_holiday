package Projects.Bank;

import com.sun.org.apache.regexp.internal.RE;

import java.awt.geom.FlatteningPathIterator;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/29/14:17
 * @Description:
 **/
public class CustomerList {
     private Customer[] customers;//用来保存客户对象的数组,创建对象
    int total = 0;//记录已保存客户对象的数量
    /*
    构造器，用来初始化customers数组
    totalCustomer：totalCustomer：指定customers数组的最大值
     */
    public CustomerList(int totalCustomer){
         customers = new Customer[totalCustomer];//在构造器中初始化对象
         //this.customers = new Customer[totalCustomer];//测试对象,this此时可运行,但省略
        //Customer[] customers = new Customer[totalCustomer];//错误写法customers在上面声明后一直没使用,定义的customers 变量从未被请求使用过。 也就是说你只声明或者赋值但是从来没有真正使用过该私有成员变量。
    }
    /*
    用途：将参数customer添加到数组中最后一个客户对象记录之后
    参数：customer指定要添加的客户对象
    返回：添加成功返回true；false表示数组已满，无法添加
     */
    public boolean addCustomer(Customer customer){
            if (total>= customers.length){
                return false;
            }
//            customers[total]=customer;
//            total++;
              customers[total++]=customer;
              return true;
    }
    /*
    修改指定客户的信息
     */
    public boolean replaceCustomer(int index, Customer cust){
            if (index<0||index>=total){
                return false;
            }else
                customers[index]=cust;
            return true;
    }
    public boolean deleteCustomer(int index){
        if (index<0||index>=total){
            return false;
        }else
            for (int i=index;i<total-1;i++){  //循环使数组连接
                customers[i]=customers[i+1];
            }
//            customers[total-1]=null;//将删除的那项(经循环替换后为最后一项)置空
//            total--;
        //或
            customers[--total]=null;
            return true;
    }
    public Customer[] getAllCustomers(){//获取客户信息
        Customer[] customers1 =new Customer[total];
        for (int i=0;i<total;i++) {
            customers1[i] = customers[i];
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
        }else
            return customers[index];
    }
    /*
    获取客户数量
     */
    public int getTotal(){
        return total;
        //return customers.length;  /错误注意是客户人数,不一定数组全部用完,不能用数组长度

    }



}