package domain;

import java.util.Map;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 16:48 2019/7/30
 * @Modificd By;
 */
public class UserMap {

    private Map<String,User> users;

    public Map<String, User> getUserMap() {
        return users;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.users = userMap;
    }

    @Override
    public String toString() {
        return "UserMap{" +
                "users=" + users +
                '}';
    }
}
