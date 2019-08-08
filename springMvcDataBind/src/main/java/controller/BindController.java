package controller;


import domain.*;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 9:37 2019/7/30
 * @Modificd By;
 */



@Controller
public class BindController {
    /*
    * 基本数据类型
    *
    * */

//    http://localhost:8080/test3?name=Tom
//    http://localhost:8080/test3?name=带不带参数都不报错
//    解决方法返回值中文乱码，方法一，只对单个方法有效
    @RequestMapping(value = "/test1",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String test1(String name){
        return "name="+ name;
    }

//    http://localhost:8080/test2?id=1
//    http://localhost:8080/test2?id=带不带参数都不会报错
    @RequestMapping("/test2")
    @ResponseBody
    public String test2(Integer id){
        return "id="+id;
    }
//    http://localhost:8080/test3?id=1不带参数会报错
    @RequestMapping("/test3")
    @ResponseBody
    public String test3(int id){
        return "id="+id;
    }
//http://localhost:8080/test4?xid=1
    @RequestMapping("/test4")
    @ResponseBody
    public String test4(@RequestParam(value = "xid") Integer id){
        return "id="+id;
    }


    /*
    * 对象数据绑定
    * */

    @RequestMapping("/test5")
    @ResponseBody
    public String test5(User user){
        return "user="+user;
    }

    @RequestMapping("/test6")
    @ResponseBody
    public String test6(Book book, User user){
        return "user="+user+"book="+book;
    }


    @InitBinder("user")
    public void initUser(WebDataBinder binder){
        binder.setFieldDefaultPrefix("user");
    }

    @RequestMapping("/test7")
    @ResponseBody
    public String test7(Order order){
        return "Order="+order;
    }


    /*
    * 日期绑定
    * */
    @RequestMapping(value = "/test8")
    @ResponseBody
    public String test8(Date date1) {
        return date1.toString();
    }



    @RequestMapping(value = "/test9")
    @ResponseBody
    public String test9(Date date2) {
        return date2.toString();
    }

    @InitBinder("date2")
    public void initDate(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

    /*
    * 复杂类型
    * */
//    http://localhost:8080/a1?ids=1&ids=2
    @RequestMapping(value = "/a1")
    @ResponseBody
    public String objecttype1(String[] ids) {
        System.out.println(ids.length);
        StringBuilder stringBuilder = new StringBuilder();
        for(String id : ids) {
            stringBuilder.append(id + " ");
        }
        return stringBuilder.toString();
    }


    @RequestMapping(value = "/a2")
    @ResponseBody
    public String objecttype2(@RequestBody UserList userList) {
        return userList.toString();
    }

    // http://localhost:8080/springmvc/complextype2.do?users%5B0%5D.name=Tom&users%5B1%5D.name=Lucy&users%5B2%5D.name=Mary 注意特殊字符[]的转义，不然会报错
    @RequestMapping(value = "/a3")
    @ResponseBody
    public String objecttype3(UserSet userSet) {
        System.out.println(userSet.getUsers().size());
        return userSet.toString();
    }

    // http://localhost:8080/springmvc/complextype4.do?users%5B%270%27%5D.name=Tom&users%5B%271%27%5D.name=Lucy&users%5B%272%27%5D.name=Mary
    @RequestMapping(value = "/a4")
    @ResponseBody
    public String objecttype4(UserMap userMap) {
        System.out.println(userMap.getUserMap().size());
        return userMap.toString();
    }

    @RequestMapping(value = "/j")
    @ResponseBody
    public User jsontype(@RequestBody User user) {
        System.out.println(user);
        return user;
    }
}
