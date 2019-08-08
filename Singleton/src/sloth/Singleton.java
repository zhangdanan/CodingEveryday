package sloth;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 10:47 2019/7/30
 * @Modificd By;
 */

/*
*
* 懒汉模式，线程不安全
* */
public class Singleton {
    private static  Singleton instance;

//    单例模式的构造方法必须是private
    private Singleton(){

    }

    public static Singleton getInstance(){

        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }


}
