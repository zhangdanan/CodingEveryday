package sloth.zhang.pojo;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 10:22 2019/8/5
 * @Modificd By;
 */
public class User {
    private String userId;
    private String username;
    private String password;
    private String mobileNum;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
}
