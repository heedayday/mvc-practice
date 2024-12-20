package com.heeday.mvc.view;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class JspView implements View {
    private final String name;

    public JspView(String name) {
        this.name = name;
    }

    //::더블 세미콜론 람다식에서 한번 더 나아간 경우 사용 https://lucky516.tistory.com/67#google_vignette
    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        model.forEach(request::setAttribute);                       //model에 하나씩 들어감 모델에 값이 있으면 setAttribute해달라는 코드 https://0rcticfox.tistory.com/entry/%EC%9E%90%EB%B0%94Java-forEach-%EC%82%AC%EC%9A%A9%EB%B2%95

        //21,22 화면으로 포워딩을 해주는 부분
        RequestDispatcher rd = request.getRequestDispatcher(name);  //RequestDispatcher https://velog.io/@zionedoha/JAVA-RequestDispatcher%EA%B0%80-%EB%AC%B4%EC%97%87%EC%9D%BC%EA%B9%8C%EC%9A%94
        rd.forward(request, response);                              //RequestDispatcher forward()메소드 https://sgcomputer.tistory.com/235
    }
}