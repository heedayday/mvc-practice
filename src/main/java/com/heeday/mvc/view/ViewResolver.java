package com.heeday.mvc.view;

public interface ViewResolver {
    View resolveViewName(String viewName);
}