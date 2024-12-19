package com.heeday.mvc.view;

public class JspViewResolver implements ViewResolver {
    @Override
    public View resolveViewName(String viewName) {
        if (viewName.startsWith(RedirectView.DEFAULT_REDIRECT_PREFIX)) { //startsWith 체크하려는 문자열로 시작하면 true https://jamesdreaming.tistory.com/86
            return new RedirectView(viewName);
        }
        return new JspView(viewName + ".jsp");
    }
}