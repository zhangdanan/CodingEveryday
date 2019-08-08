package controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;




/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 9:16 2019/7/29
 * @Modificd By;
 */



@Controller
public class SimpleController {

  @RequestMapping("/simple")
    public String Simple(){
        return"/index";
    }

    @RequestMapping("/mvc")
    public String zhang(){
        return"/login";
    }



}


