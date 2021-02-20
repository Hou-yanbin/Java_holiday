package exercise.StaticTest;

import javax.swing.colorchooser.AbstractColorChooserPanel;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/5/21:42
 * @Description:
 **/
public class AccountTest{
    public static void main(String[] args) {
        Account account=new Account(654123,50000);
        Account account1=new Account(123456,20000);
        Account account2=new Account(123654,745754);
        Account.setInterestRate(0.012);
        Account.setMinMoney(30);
        System.out.println(account.getInterestRate());
        System.out.println(account.getMinMoney());
        System.out.println(account);
        System.out.println(account1);
        System.out.println(account2);

    }


}