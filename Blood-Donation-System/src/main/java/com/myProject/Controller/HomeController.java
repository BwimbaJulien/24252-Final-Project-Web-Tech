package com.myProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/aboutUs")
    public String about(){
        return "about";
    }

    @GetMapping("/contactUs")
    public String contact(){
        return "contact";
    }

    @GetMapping("/supporters")
    public String supporters(){
        return "supports";
    }
}
