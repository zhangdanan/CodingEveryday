package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 16:48 2019/7/30
 * @Modificd By;
 */
public class UserList {
    private List<User> users=new ArrayList<>();

    public List<User> getUserList() {
        return users;
    }

    public void setUserList(List<User> userList) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserList{" +
                "users=" + users +
                '}';
    }
}
