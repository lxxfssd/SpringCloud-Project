package com.gac.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("service-member")
public interface  UserService {

    @GetMapping("/getUserList")
    List<String> getUserList();
}
