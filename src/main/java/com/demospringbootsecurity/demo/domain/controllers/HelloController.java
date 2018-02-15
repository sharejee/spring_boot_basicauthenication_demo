package com.demospringbootsecurity.demo.domain.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
Create By: Ron Rith
Create Date: 2/15/2018
*/
@Controller
public class HelloController {
    @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
    private String showHello() {
        return "hello";
    }
}
