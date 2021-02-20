package Bank;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/27/19:47
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
    public void withdraw(double amount){//存钱
        this.balance+=amount;
        System.out.println("存入: "+amount+"\t"+"目前余额为:"+balance);
    }
    public void deposit(double amount){//取钱
        if (this.balance<amount){
            System.out.println("余额不足!");
            return;
        }
        this.balance-=amount;
        System.out.println("取出: "+amount+"\t"+"目前余额为:"+balance);
    }
}