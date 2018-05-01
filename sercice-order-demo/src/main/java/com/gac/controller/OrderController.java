package com.gac.controller;

import com.gac.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/getString")
    public List<String> getString() {
        return memberService.getOrderByUserList();
    }
}
