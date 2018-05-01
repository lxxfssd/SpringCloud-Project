package com.gac.service;

import com.gac.service.impl.UserServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "service-member", fallback = UserServiceImpl.class)
public interface  UserService {

    @GetMapping("/getUserList")
    public List<String> getUserList();
}
