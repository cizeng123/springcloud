package com.example.provider8001.controller;

import com.example.provider8001.entity.User;
import com.example.provider8001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/order")
    @ResponseBody
    public Integer select(@RequestParam String username,@RequestParam String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        Integer count = userService.insert(user);
        return count;
    }

    @RequestMapping(value = "/call",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String call(){
        return "resultaurantA is open!";
    }
}
