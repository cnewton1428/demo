package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String homePage(Model model) {
        model.addAttribute("myval", "Welcome");
        model.addAttribute("vals","greetings");
        return "hometemplate";
    }
}
