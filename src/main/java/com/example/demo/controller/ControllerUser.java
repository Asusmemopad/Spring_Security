package com.example.demo.controller;

import com.example.demo.security.details.UserDetailsImpl;
import com.example.demo.transfer.UserDto;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.example.demo.transfer.UserDto.from;

@Controller
public class ControllerUser {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getLoginPage(ModelMap model, Authentication authentication){
        UserDetailsImpl details = (UserDetailsImpl) authentication.getPrincipal();
        UserDto user = from(details.getUser());
        model.addAttribute("user", user);
        return "profile";
    }
}
