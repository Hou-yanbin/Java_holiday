package SuperBank;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/31/14:03
 * @Description:
 **/
public class CheckAccount extends Account{
    private double overdraft;//可透支限额

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    //取钱
    public void withdraw (double amount){

        if (amount<=getBalance()) {
            //方式一,但是银行一般不会提供setblance来设置余额,所以用第二种
            //setBalance(getBalance()-amount);
            //方式二
            super.withdraw(amount);
            System.out.println("您的账户余额为: "+getBalance()+"\n"+"您的可透支余额为: "+getOverdraft());
        }
        else if (amount>getBalance()){
            if (amount<=(getBalance()+getOverdraft())){
                amount-=getBalance();
                setBalance(0);
                setOverdraft(getOverdraft()-amount);
                System.out.println("您的账户余额为: "+getBalance()+"\n"+"您的可透支余额为: "+getOverdraft());

            }else {
                System.out.println("超出可透支额度!");
                System.out.println("您的账户余额为: " + getBalance() + "\n" + "您的可透支余额为: " + getOverdraft());

            }
        }

    }

}