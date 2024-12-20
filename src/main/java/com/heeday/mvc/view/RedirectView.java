package com.heeday.mvc.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class RedirectView implements View {
    public static final String DEFAULT_REDIRECT_PREFIX = "redirect:"; //public이어서 다른 곳에서도 사용이 가능
    private final String name;

    public RedirectView(String name) {
        this.name = name;
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        model.forEach(request::setAttribute);

        response.sendRedirect(name.substring(DEFAULT_REDIRECT_PREFIX.length())); //redirect:값 이후의 것을 활용하도록 자름
    }
}