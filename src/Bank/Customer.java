package Bank;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/27/19:57
 * @Description:
 **/
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;


    public Customer(String f,String l){
        this.firstName=f;
        this.lastName=l;

    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

}