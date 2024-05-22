package org.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web.dto.Result;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/test")
    public Result test(){
        return new Result<>();
            }





}
