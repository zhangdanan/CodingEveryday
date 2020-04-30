package sloth;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 9:41 2019/7/31
 * @Modificd By;
 */
public class Singleton4 {
    private Singleton4 instance=null;

    {

        instance=new Singleton4();
    }

    private Singleton4(){}

    public Singleton4 getInstance(){
        return this.instance;
    }


}
