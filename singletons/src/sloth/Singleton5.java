package sloth;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 9:47 2019/7/31
 * @Modificd By;
 */

/*
* 静态内部类
* */
public class Singleton5 {
    private static class SingletonHolder{
        private static final Singleton5 instance=new Singleton5();
    }

    private Singleton5(){}

    public static final Singleton5 getInstace(){
        return SingletonHolder.instance;
    }
}
