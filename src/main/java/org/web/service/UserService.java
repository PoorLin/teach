package org.web.service;

import org.springframework.stereotype.Service;
import org.web.dto.Result;

@Service
public class UserService {

    public UserService(){
        System.out.println(123);
    }

    public Result createUser(){

        return new Result(200,"success");
    }



}
