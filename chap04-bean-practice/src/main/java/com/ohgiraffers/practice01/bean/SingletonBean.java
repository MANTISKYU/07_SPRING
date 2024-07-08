package com.ohgiraffers.practice01.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    private String message;



    @Scope("singleton")
    public void SingletonBean(String message) {
        System.out.println("1번째 메세지");
    }

    public String getMessage() {
        return message;
    }
}
