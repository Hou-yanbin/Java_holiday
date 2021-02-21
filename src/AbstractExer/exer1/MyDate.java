package AbstractExer.exer1;

import java.sql.SQLOutput;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/21/12:31
 * @Description:
 **/
/*
（2）MyDate类包含:
private成员变量year,month,day ；
toDateString()方法返回日期对应的字符串：xxxx年xx月xx日
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toDateString(){

        return year+"年"+month+"月"+day+"日";
    }
}