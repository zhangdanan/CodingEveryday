package sloth;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 9:35 2019/7/31
 * @Modificd By;
 */

/*
* 懒汉模式，线程安全
* */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){
        if (instance==null){
            instance=new Singleton2();
        }
        return instance;

    }
}
