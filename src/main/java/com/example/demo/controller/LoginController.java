package com.example.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLoginPage(Authentication authentication,
                               ModelMap modelMap, HttpServletRequest request){
        if (authentication != null){
            return "redirect:/login";
        }
        if (request.getParameterMap().containsKey("error"))
            modelMap.addAttribute("error",
                    "Логін або параоль введені невірно");
        return "login";
    }
}
