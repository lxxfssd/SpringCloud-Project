package com.gac.controller;

import com.gac.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api("用户信息接口")
@RequestMapping("/swagger")
public class IndexController {

    @GetMapping("/{id}")
    @ApiOperation(value="查询用户", notes="根据id来查询用户")
    @ApiImplicitParam(name = "id", value = "用户ID")
    public User getUser(@PathVariable String id){
        User user = new User();
        user.setUserName("222");
        user.setPassWord("root明羽");
        return user;
    }

    @GetMapping("/userDetail/{id}")
    @ApiOperation(value="查询用户详情", notes="根据id来查询用户详情信息")
    @ApiImplicitParam(name = "id", value = "用户ID")
    public User getUserDetail(@PathVariable String id){
        User user = new User();
        user.setUserName("333");
        user.setPassWord("root明羽");
        return user;
    }

    @ApiOperation(value="获取所有用户详细信息", notes="获取用户列表信息")
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUserList(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setPassWord("ricky");
        user.setUserName("root");
        list.add(user);
        return list;
    }

}
