package exercise;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/1/26/17:13
 * @Description: 递归求值
 **/
public class RecursionTest {
    public static void main(String[] args) {

        System.out.println(new Number().getSum(100));
        System.out.println(new Number().getxSum(10));
//        int sum=1;
//        for (int i=1;i<11;i++){
//
//            sum*=i;
//        }
//        System.out.println(sum);
    }
}
class Number{
    public int getSum(int num){
        if (num==1)
        {
            return 1;
        }
        else {
            return num+getSum(num-1);
        }
    }
    public int getxSum(int num){
        if (num==1)
        {
            return 1;
        }
        else {
            return num*getxSum(num-1);
        }
    }
}
