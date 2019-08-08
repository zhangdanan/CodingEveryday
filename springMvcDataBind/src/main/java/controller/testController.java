package controller;

import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 16:05 2019/8/2
 * @Modificd By;
 */

@Controller
public class testController {

    @GetMapping("/qq")
    public String test(User user){
        return "index";
    }
}
