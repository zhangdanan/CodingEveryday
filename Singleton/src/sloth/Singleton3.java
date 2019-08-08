package sloth;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 9:39 2019/7/31
 * @Modificd By;
 */

/*
*
* 饿汉
* */
public class Singleton3 {
    private static Singleton3 instance=new Singleton3();
    private Singleton3(){
    }

    public static Singleton3 getInstance(){
        return instance;
    }

}
