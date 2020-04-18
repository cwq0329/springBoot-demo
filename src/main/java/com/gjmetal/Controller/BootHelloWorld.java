package com.gjmetal.Controller;

import com.gjmetal.pojo.User;
import com.gjmetal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootHelloWorld {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello method is running. ");
        return "hello SpringBoot";
    }

    @RequestMapping("/user/{id}")
    @ResponseBody
    public User user(@PathVariable("id") Long id){
       return userService.queryById(id);
    }
}
