package Projects.Bank;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/29/14:16
 * @Description:
 **/
public class Customer {
    String name;
    char gender;
    int age;
    String phone;
    String email;

    public Customer(){

    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//    public void getDetails(){
//        System.out.println(this.getName() + "\t" + this.getGender() + "\t" + this.getAge() + "\t\t" + this.getPhone() + "\t" + this.getEmail());
//    }
}