package com.edumission.edumission.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/")
    public String homepage(){
        return "index";
    }

    @GetMapping("/about")
    public String aboutpage(){
        return "about";
    }

    @GetMapping("/courses")
    public String coursespage(){
        return "courses";
    }

    @GetMapping("/project")
    public String projectpage(){
        return "form";
    }

    @GetMapping("/services")
    public String servicespage(){
        return "services";
    }

    @GetMapping("/contact")
    public String contactpage(){
        return "contact";
    }
}
