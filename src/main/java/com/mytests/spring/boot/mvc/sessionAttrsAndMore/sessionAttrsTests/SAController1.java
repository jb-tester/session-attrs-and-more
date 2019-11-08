package com.mytests.spring.boot.mvc.sessionAttrsAndMore.sessionAttrsTests;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 11/8/2019.
 * Project: session-attrs-and-more
 * *******************************
 */
@Controller
@RequestMapping("/sessionattrs")
public class SAController1 {
    @RequestMapping("/test1")
    public String test1(ModelMap model, @SessionAttribute("globalSessionAttr1") String gsa1,
                        @SessionAttribute("globalSessionAttr2") String gsa2, @RequestAttribute("start") Long ra) {
             model.addAttribute("sa", gsa1+" "+gsa2);
             model.addAttribute("ra", ra);
        return "sa_test1";
    }

}
