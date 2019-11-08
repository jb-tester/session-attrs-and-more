package com.mytests.spring.boot.mvc.sessionAttrsAndMore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("home_attr", "hello!");
        return "home";
    }
}
