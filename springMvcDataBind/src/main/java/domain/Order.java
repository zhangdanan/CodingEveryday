package domain;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 10:45 2019/7/30
 * @Modificd By;
 */
public class Order {
    private String orderId;
    private User user;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "order{" +
                "orderId='" + orderId + '\'' +
                ", user=" + user +
                '}';
    }
}
