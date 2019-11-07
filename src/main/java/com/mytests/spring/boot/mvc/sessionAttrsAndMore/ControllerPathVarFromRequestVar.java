package com.mytests.spring.boot.mvc.sessionAttrsAndMore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/pathvars_tests/from_autowired_request_var/{mypathvar}")
public class ControllerPathVarFromRequestVar {

    @Autowired
    HttpServletRequest req;

    @RequestMapping("/test")
    public String mybean_test(ModelMap model) {
        model.addAttribute("mypathvar_attr", getPathvar());
        return "req_test";
    }

    private String getPathvar() {
        Map<String, String> variables = (Map<String, String>)
                req.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
        return variables.get("mypathvar");
    }
}
