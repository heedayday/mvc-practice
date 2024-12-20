package com.heeday.mvc.view;

public class JspViewResolver implements ViewResolver {
    @Override
    public View resolveViewName(String viewName) {
        //render를 해서 구분을 해줌 redirectView인지 jspView인지 확인
        if (viewName.startsWith(RedirectView.DEFAULT_REDIRECT_PREFIX)) { //startsWith 체크하려는 문자열로 시작하면 true https://jamesdreaming.tistory.com/86
            return new RedirectView(viewName);
        }
        //여기서 .jsp를 붙여줌
        return new JspView(viewName + ".jsp");
    }
}