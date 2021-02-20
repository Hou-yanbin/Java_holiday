package SuperBank;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/31/14:41
 * @Description:
 **/
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount=new CheckAccount(1122,20000,0.045,5000);
        checkAccount.withdraw(5000);
        checkAccount.withdraw(18000);
        checkAccount.withdraw(3000);

    }
}