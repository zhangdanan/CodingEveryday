package sloth.zhang.springbootdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sloth.zhang.springbootdatajpa.entity.User;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 15:49 2019/8/8
 * @Modificd By;
 */
public interface UserRepository extends JpaRepository<User,Long> {

    public User findByEmailAndName(String email,String name);



}
