package com.minpooh.travel.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController {
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main() {
        return "main";
    }
}
