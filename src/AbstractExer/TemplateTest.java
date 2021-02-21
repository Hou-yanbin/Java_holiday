package AbstractExer;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/2/20/17:52
 * @Description:
 **/
/*
 * 抽象类的应用：模板方法的设计模式
 *
 */
public class TemplateTest {
    public static void main(String[] args) {
        /*
        Template template=new Template() {
            @Override
            public void code() {

            }
        };
        template.speedTime();
        若Template  new对象则必须重写了code()
         */
    SubTemplate subTemplate=new SubTemplate();
    subTemplate.speedTime();
    }
}

//计算某段代码执行所需要花费的时间
abstract class Template{
    public void speedTime(){
        long start=System.currentTimeMillis();
        for (int i=0;i<10;i++) {
            code();//不确定的部分、易变的部分
        }
        long end=System.currentTimeMillis();
        System.out.println("花费的时间是: "+(end-start));
    }
    public abstract void code();
}

class SubTemplate extends Template{
    public void code(){//遍历1000以内的质数
        for(int i = 2;i <= 1000;i++){
            boolean isFlag = true;
            for(int j = 2;j <= Math.sqrt(i);j++){

                if(i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i);
            }
        }
    }
}