package com.gjmetal.Controller;

import com.gjmetal.pojo.User;
import com.gjmetal.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(description = "用户操作接口")
@Controller
//@RestController
public class BootHelloWorld {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {

        System.out.println("hello method is running.项目经理123456 ");
        System.out.println("分支");

        return "hello SpringBoot";
        //开发人员写了一句话
    }

    @ApiOperation(value = "获取信息", notes = "通过id获取信息")
//    @ApiImplicitParam(name = "id", value = "编码", paramType = "query", required = true, dataType = "Long")
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
//    @RequestMapping("/user/{id}")
    @ResponseBody
    public User user(@PathVariable("id") Long id) {
        return userService.queryById(id);
    }
}
