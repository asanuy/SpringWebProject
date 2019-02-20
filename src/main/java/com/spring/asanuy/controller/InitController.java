package com.spring.asanuy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class InitController {

    private static final String INDEX = "index";

    @RequestMapping(method = RequestMethod.GET)
    public String getIndexPage() {
        return INDEX;
    }
}
