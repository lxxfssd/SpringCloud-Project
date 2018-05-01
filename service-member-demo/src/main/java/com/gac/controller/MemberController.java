package com.gac.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getUserList")
    public List<String> getUserList() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("zhangsan");
        listUser.add("lisi");
        listUser.add("yushengjun");
        listUser.add("端口号:"+serverPort);
        return listUser;
    }
}
