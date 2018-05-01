package com.gac.controller;

import com.gac.entity.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api("用户信息接口")
@RequestMapping("/swagger")
public class IndexController {

    @GetMapping("/{name}/{password}")
    @ApiOperation(value="查询用户", notes="根据id来查询用户")
    @ApiImplicitParams(
            {@ApiImplicitParam(name = "name", value = "用户名"),
            @ApiImplicitParam( name = "password", value = "密码")}
    )
    public User getUser(@PathVariable String name, @PathVariable String password){
        User user = new User();
        user.setUserName(name);
        user.setPassWord(password);
        return user;
    }

    @GetMapping("/userDetail")
    @ApiOperation(value="查询用户详情", notes="根据id来查询用户详情信息")

    public User getUserDetail(@ApiParam(name = "name", value = "用户名") @RequestParam("name") String name){
        User user = new User();
        user.setUserName(name);
        user.setPassWord("root");
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
