package org.web.controller;

import org.springframework.web.bind.annotation.*;
import org.web.dto.Result;
import org.web.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        System.out.println(456);

        this.userService=userService;
    }


    @GetMapping("/test")
    public Result test(){
        System.out.println(123);
        return new Result(200,"success");
    }
    @PostMapping("/test")
    public Result test2(){
        System.out.println(456);
        return new Result();
    }


    @PostMapping("/createUser")
    public Result createUser(){
        System.out.println(456);
        return new Result();
    }






}