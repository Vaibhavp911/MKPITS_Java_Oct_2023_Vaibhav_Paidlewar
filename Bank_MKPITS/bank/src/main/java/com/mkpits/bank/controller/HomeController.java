package com.mkpits.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/aboutus")
    public String about() {
        return "aboutus";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/services")
    public String service() {
        return "services";
    }

    @GetMapping("/loginregister")
    public String loginRegister() {
        return "login-register";
    }
}
