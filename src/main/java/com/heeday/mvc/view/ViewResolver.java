package com.heeday.mvc.view;

public interface ViewResolver {
    //view name을 받아서 view를 결정
    View resolveViewName(String viewName);
}