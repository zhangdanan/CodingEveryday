package sloth.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sloth.zhang.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 8:44 2019/8/1
 * @Modificd By;
 */

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("info", "user/list");
        return "index";
    }

    @GetMapping("/user")
    public String hehe(Model model) {
        model.addAttribute("user", new User(UUID.randomUUID().toString(), "yizhiwazi", "20170928"));
        return "user";
    }

    @GetMapping("/user/list")
    public String userlist(Model model) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(UUID.randomUUID().toString(), "yizhiwazi", "20170928"));
        userList.add(new User(UUID.randomUUID().toString(), "kumamon", "123456"));
        userList.add(new User(UUID.randomUUID().toString(), "admin", "admin"));
        model.addAttribute("userList", userList);
        return "userList";
    }
}
