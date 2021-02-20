package exercise;

import exercise.Person;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/27/16:00
 * @Description:
 **/
/*
在 exercise.PersonTest 类 中实例化 exercise.Person 类的对象 b ，
调 用 setAge() 和getAge()方法，体会Java的封装性。
 */
public class PersonTest {
    public static void main(String[] args) {
        Person process =new Person();
        //process.age;//权限私有,不能调用,编译不通过
        process.setAge(6);
        System.out.println("年龄为:"+process.getAge());
    }




}