package sloth.zhang;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 10:01 2019/11/8
 * @Modificd By;
 */
class Cat {
    public Cat(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Cat c1 = new Cat("王磊");
        Cat c2 = new Cat("王磊");
        System.out.println(c1.equals(c2)); // false
    }
}
