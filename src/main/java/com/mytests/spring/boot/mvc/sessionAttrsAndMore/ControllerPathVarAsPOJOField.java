package com.mytests.spring.boot.mvc.sessionAttrsAndMore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pathvars_tests/pojo_tests/my_bean/{id}")
public class ControllerPathVarAsPOJOField {



    @RequestMapping("/test")
    public String mybean_test(ModelMap model, MyBean myBean) {
        model.addAttribute("mybean_id", myBean.getId());
        return "mybean_test";
    }
}
