package com.example.demo.controller;

import com.example.demo.form.UserForm;
import com.example.demo.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService service;

    @GetMapping
    public String getSignUpPage(){
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(HttpServletRequest request){
        UserForm userForm = new UserForm();
        userForm.setFirstName(request.getParameter("firstName"));
        userForm.setLastName(request.getParameter("lastName"));
        userForm.setLogin(request.getParameter("login"));
        userForm.setPassword(request.getParameter("pass"));
        service.signUp(userForm);
        return "redirect:/login";
    }
}
