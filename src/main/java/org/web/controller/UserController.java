package org.web.controller;

import org.springframework.web.bind.annotation.*;
import org.web.dto.Result;
import org.web.entity.Users;
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
    public Result createUser(@RequestBody Users users){
        return userService.createUser(users);
    }

    @PutMapping("/updateUser")
    public Result updateUser(){
        return userService.updateUser();
    }
    @DeleteMapping("/deleteUser")
    public Result deleteUser(){
        return userService.deleteUser();
    }

    @GetMapping("/getUser/{id}")
    public Result getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }








}
