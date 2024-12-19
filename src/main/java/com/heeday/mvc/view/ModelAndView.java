package com.heeday.mvc.view;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ModelAndView {
    private Object view;
    private Map<String, Object> model = new HashMap<>();

    public ModelAndView(String viewName) {
        this.view = viewName;
    }
    public Map<String, Object> getModel() {
        return Collections.unmodifiableMap(model);
    } //Collections https://velog.io/@jyo925/Collections-%ED%81%B4%EB%9E%98%EC%8A%A4

    public String getViewName() {
        return (this.view instanceof String ? (String) this.view : null);
    }  //instanceof https://ko.javascript.info/instanceof
}