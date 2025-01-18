package com.heeday.mvc.controller;

import com.heeday.mvc.model.User;
import com.heeday.mvc.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** <a herf="https://jjangadadcodingdiary.tistory.com/entry/Spring-%EC%9B%B9-%EA%B0%9C%EB%B0%9C%EC%97%90%EC%84%9C%EC%9D%98-Redirect-%ED%8E%98%EC%9D%B4%EC%A7%80-%EC%9D%B4%EB%8F%99%EA%B3%BC-%EC%82%AC%EC%9A%A9-%EB%B0%A9%EB%B2%95#google_vignette">
 * redirect</a> 하기
 */

public class UserCreateController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        UserRepository.save(new User(request.getParameter("userId"), request.getParameter("name")));
        return "redirect:/users";  //users라는 클라이언트로 응답을  클라이언트는 users로 다시 요청을 보내게 됨 RequestMappingHandlerMapping /users GET UserListController가 실행이 됨
    }
}
