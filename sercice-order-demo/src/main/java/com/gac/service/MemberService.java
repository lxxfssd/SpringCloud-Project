package com.gac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private RestTemplate restTemplate;

    public List<String> getOrderByUserList() {
        return restTemplate.getForObject("http://service-member/getUserList", List.class);
    }
}
