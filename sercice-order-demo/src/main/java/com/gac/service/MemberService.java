package com.gac.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "orderError") //fallbackMethod作为服务降级指点返回内容, @HystrixCommand服务发生错误，回调方法
    public List<String> getOrderByUserList() {
        return restTemplate.getForObject("http://service-member/getUserList", List.class);
    }

    private List<String> orderError() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("not orderUser list");
        return listUser;
    }
}
