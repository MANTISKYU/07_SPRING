package com.ohgiraffers.practice01.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class PrototypeBean {

    private final PrototypeBean prototypeBean;
    private String message;

    public PrototypeBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
    }

    @Scope("prototype")
    public void PrototypeBean(String message) {

        System.out.println(prototypeBean + "번째메세지");



    }

    public String getMessage() {
        return message;
    }

}
