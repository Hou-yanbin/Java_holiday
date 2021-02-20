package exercise.StaticTest;

import javax.print.attribute.standard.PageRanges;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/5/21:33
 * @Description:
 **/

public class Account {
    private int id;
    private int password;
    private double balance;
    private static double interestRate;
    private static  double minMoney=1.0;
    private static int init = 1001;//用于自动生成id使用的

    public Account() {
        id=init++;
    }

    public Account(int password, double balance) {
        id=init++;
        this.password = password;
        this.balance = balance;
    }

    public int getId() {

        return id;

    }


    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password=" + password +
                ", balance=" + balance +
                '}';
    }
}



