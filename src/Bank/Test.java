package Bank;

import javax.print.attribute.standard.ColorSupported;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/27/20:03
 * @Description:
 **/
public class Test {
    public static void main(String[] args) {
        Customer customer=new Customer("Jane","smith");
        Account account=new Account(1000,2000,0.0123);
        customer.setAccount(account);
           customer.getAccount().withdraw(100);
           customer.getAccount().deposit(960);
           customer.getAccount().deposit(2000);
//        account.withdraw(2565);//不涉及名称所以可以空account调用
//        account.deposit(2565);//不涉及名称所以可以空account调用
        System.out.println("Customer ["+customer.getFirstName()+","+ customer.getLastName()+"]"+"has a account: id is "+account.getId()+","+" annualInterestRate is "+account.getAnnualInterestRate()*100+"%"+",balance is "
        +account.getBalance());
        }


    }
