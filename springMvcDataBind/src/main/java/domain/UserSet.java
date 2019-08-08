package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 16:48 2019/7/30
 * @Modificd By;
 */
public class UserSet {
    private Set<User> users = new HashSet<>();

    public UserSet() {
        // 固定set集合的大小为3
        users.add(new User());
        users.add(new User());
        users.add(new User());
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserSet{" +
                "users=" + users +
                '}';
    }
}
