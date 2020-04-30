package sloth.zhang;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 9:43 2019/11/8
 * @Modificd By;
 */
public class Test1 {

    public static void main(String[] args) {
        String x = "string";
        String y = "string";
        String z = new String("string");
        System.out.println(x==y); // true
        System.out.println(x==z); // false
        System.out.println(x.equals(y)); // true
        System.out.println(x.equals(z)); // true


    }

}
