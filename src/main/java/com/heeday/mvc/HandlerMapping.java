package com.heeday.mvc;

public interface HandlerMapping {
    Object findHandler(HandlerKey handlerKey);
}