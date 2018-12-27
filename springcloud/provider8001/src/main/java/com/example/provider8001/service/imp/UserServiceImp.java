package com.example.provider8001.service.imp;

import com.example.provider8001.entity.User;
import com.example.provider8001.mapper.UserMapper;
import com.example.provider8001.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImp implements UserService {
    @Resource
    private UserMapper userMapper;

    public Integer insert(User user){
        return userMapper.insert(user);
    }
}
