package com.example.rest.test;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.common.entity.User;
import com.example.rest.response.ResultVO;
import com.example.service.TestService;
import com.example.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class Test {

    @Autowired
    private TestService testService;
    @Autowired
    private UserService userService;

    @GetMapping(value = "test")
    public String test1(){


        return testService.test();
    }

    @GetMapping(value = "testUser")
    public User testUser(int id){
        return userService.find(id);
    }

    @GetMapping(value = "testUserPage")
    public List<User> testUserPage(){
        IPage<User> userIPage = userService.selectUserPage(new Page<>(1, 1));
        log.info("测试日志打印");
        System.out.println("ceshi");
        return userIPage.getRecords();
    }

    @GetMapping(value = "saveUser")
    public ResultVO saveUser(){
        User user = new User();
        user.setName("新增");
        user.setOld(10);
        user.setSex("male");
        userService.addUser(user);
        log.info("新增用户成功");
        return new ResultVO("新增成功");
    }

    @GetMapping(value = "updateUser")
    public ResultVO saveUser(Integer id,Integer old){
        userService.updateUser(id,old);
        log.info("更新用户成功");
        return new ResultVO("新增成功");
    }

}
