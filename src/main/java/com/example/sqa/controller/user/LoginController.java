package com.example.sqa.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sqa")
public class LoginController {

    @GetMapping(path = "/log")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }
}
