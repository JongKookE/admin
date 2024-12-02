package com.subject.adminfront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
