package sloth.zhang.springbootswagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 9:53 2019/8/6
 * @Modificd By;
 */

@Api("首页管理")
@Controller
public class HelloCotroller {

    @ApiOperation("欢迎界面")
    @GetMapping("/")
    public String hehe(){
        return "redirect:/swagger-ui.html";
    }
}
