package com.heeday.mvc.controller;

import com.heeday.mvc.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserListController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setAttribute("users", UserRepository.findAll()); //users를 jsp로 넘겨주는 부분 findAll등록을 했으면 전체 내용을 가져오도록 함
        return "/user/list";
    }
}