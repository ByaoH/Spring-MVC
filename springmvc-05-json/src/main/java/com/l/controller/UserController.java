package com.l.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.l.pojo.User;
import com.l.util.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController//不会走视图解析器
public class UserController {
    @RequestMapping("/j1")
//    @ResponseBody //不会走视图解析器
    public String json1() throws JsonProcessingException {
//        创建一个对象
        User user = new User("ByaoH", 3, "男");
        return JsonUtils.getJson(user);
    }
    @RequestMapping("/j2")
//    @ResponseBody //不会走视图解析器
    public String json2() throws JsonProcessingException {
        User user1 = new User("ByaoH", 3, "男");
        User user2 = new User("ByaoH", 3, "男");
        User user3 = new User("ByaoH", 3, "男");
        User user4 = new User("ByaoH", 3, "男");
        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        return JsonUtils.getJson(userList);
    }
    @RequestMapping("/j3")
//    @ResponseBody //不会走视图解析器
    public String json3() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getJson(date);
    }
    @RequestMapping("/j4")
//    @ResponseBody //不会走视图解析器
    public String json4() throws JsonProcessingException {
        User user1 = new User("ByaoH", 3, "男");
        User user2 = new User("ByaoH", 3, "男");
        User user3 = new User("ByaoH", 3, "男");
        User user4 = new User("ByaoH", 3, "男");
        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        String s = JSON.toJSONString(userList);
        return s;
    }
}
