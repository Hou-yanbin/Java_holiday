package exercise;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/27/15:59
 * @Description:
 **/
/*
1.创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
在 exercise.PersonTest 类 中实例化 exercise.Person 类的对象 b ，
调 用 setAge() 和getAge()方法，体会Java的封装性。
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}