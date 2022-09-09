package com.kaze.controller;


import com.kaze.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
//    请求前缀路径
@RequestMapping("/user")
public class UserController {
//    设置当前操作的访问路径
    @RequestMapping("/save")
//    设置当前的操作的返回值类型
    @ResponseBody
    public String save() {
        System.out.println("user save...");
        return "{'info':'SpringMvc'}";
    }


    @RequestMapping("/delete")
    @ResponseBody
    public String delete() {
        System.out.println("user save...");
        return "{'info':'SpringMvc delete'}";
    }

    @RequestMapping("/param1")
    @ResponseBody
//    参数传递
    public String param1(String name,int age) {
        System.out.println(name);
        System.out.println(age);
        return "{'info':'SpringMvc delete'}";
    }

    @RequestMapping("/param2")
    @ResponseBody
//    参数传递
//    @RequestParam 绑定传参的名字
//    前端传来的name，后端字段名时username
    public String param2(@RequestParam("name") String username, int age) {
        System.out.println(username);
        System.out.println(age);
        return "{'info':'SpringMvc delete'}";
    }

    @RequestMapping("/param3")
    @ResponseBody
//    参数传递
//    @RequestParam 绑定传参的名字
//    参数类型：POJO类，框架自动识别
    public String param3(User user) {
        System.out.println(user);
        return "{'info':'SpringMvc delete'}";
    }

    @RequestMapping("/param4")
    @ResponseBody
//    参数传递
//    @RequestParam 绑定传参的名字
//    参数类型：数组，框架自动识别
    public String param4(String []likes) {
        System.out.println(Arrays.toString(likes));
        return "{'info':'SpringMvc delete'}";
    }

    @RequestMapping("/param5")
    @ResponseBody
//    参数传递
//    @RequestParam 集合需要写
//    参数类型：集合，框架自动识别
    public String param5(@RequestParam List<String> likes) {
        System.out.println(likes);
        return "{'info':'SpringMvc delete'}";
    }

    @RequestMapping("/param6")
    @ResponseBody
//    参数传递
//    @RequestBody Json在请求体内
//    参数类型：集合参数 Json，框架自动识别
    public String param6(@RequestBody List<String> likes) {
        System.out.println(likes);
        return "{'info':'SpringMvc delete'}";
    }

    @RequestMapping("/param7")
    @ResponseBody
//    参数传递
//    @RequestParam Json在请求体内
//    参数类型：POJO类 Json，框架自动识别
    public String param7(@RequestBody User user) {
        System.out.println(user);
        return "{'info':'SpringMvc delete'}";
    }

    @RequestMapping("/param8")
    @ResponseBody
//    参数传递
//    @RequestParam Json在请求体内
//    参数类型：参数 Json，框架自动识别
    public String param8(@RequestBody List<User> users) {
        System.out.println(users);
        return "{'info':'SpringMvc delete'}";
    }


}
