package SuperBank;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/31/13:47
 * @Description:
 **/
public class Account {
    private int id;//账号
    private double balance;//余额
    private double annualInterestRate;//年利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterest(){
        return getAnnualInterestRate()/12;
    }
    //取钱
    public void withdraw (double amount){
        if (balance>=amount){
            balance-=amount;
            //System.out.println("取款: "+amount+","+"当前余额为: "+balance);
            return;
        }
        else{
            //System.out.println("余额不足!");
            //System.out.println("当前余额为: "+balance);
            return;
        }
    }
    //存钱
    public void deposit (double amount){
        balance+=amount;
        System.out.println("存款: "+amount+","+"当前余额为: "+balance);

    }
}