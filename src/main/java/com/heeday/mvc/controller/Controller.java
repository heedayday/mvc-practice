package com.heeday.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//공통 interface controller를 지정하고 implements 해서 사용
public interface Controller {
    String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
