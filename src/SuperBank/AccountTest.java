package SuperBank;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/31/13:57
 * @Description:
 **/
public class AccountTest {
    public static void main(String[] args) {
        Account account=new Account(1122,20000,0.045);
        account.withdraw(30000);
        account.deposit(3000);
        System.out.println("月利率为: "+account.getMonthlyInterest());
    }



}