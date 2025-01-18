package com.heeday.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** 공통 interface controller를 지정하고 implements 해서 사용
 * <a herf="https://javacan.tistory.com/entry/130">handleRequest</a> */
public interface Controller {
    // Spring 에서는 handleRequest()메소드를 호출하여 클라이언트의 요청을 처리함
    String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
