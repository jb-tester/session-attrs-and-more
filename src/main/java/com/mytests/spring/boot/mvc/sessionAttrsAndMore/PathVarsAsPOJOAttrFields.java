package com.mytests.spring.boot.mvc.sessionAttrsAndMore;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.ModelMap;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pathvars_tests/pojo_tests")
public class PathVarsAsPOJOAttrFields {
    @RequestMapping("/my_pojo/{name}/{age}")
    public ModelAndView home(MyPOJO pojo) {
        ModelAndView model = new ModelAndView("pojo_test");
        model.addObject("foo_bar", "foo");
        model.addObject("mypojo_name", pojo.getName());
        model.addObject("mypojo_age", pojo.getAge());

        return model;
    }

    @RequestMapping("/my_pojo2/{name}/{age}")
    public String my_pojo2(ModelMap model, MyPOJO pojo) {
        model.addAttribute("my_pojo2_name", pojo.getName());
        return "pojo2_test";
    }

}
