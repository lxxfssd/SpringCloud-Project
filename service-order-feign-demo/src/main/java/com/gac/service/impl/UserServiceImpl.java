package com.gac.service.impl;

import com.gac.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public List<String> getUserList() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("not orderUser list");
        return listUser;
    }
}
