package com.heeday.mvc.controller;

import com.heeday.mvc.annotation.Controller;
import com.heeday.mvc.annotation.RequestMapping;
import com.heeday.mvc.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//RequestMapping https://backendcode.tistory.com/227
@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("users", UserRepository.findAll());
        return "home";
    }
}