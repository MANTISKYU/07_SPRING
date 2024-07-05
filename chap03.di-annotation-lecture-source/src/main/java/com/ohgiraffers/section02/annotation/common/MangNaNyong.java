package com.ohgiraffers.section02.annotation.common;

import org.springframework.stereotype.Component;

@Component
public class MangNaNyong implements Pokemon{
    @Override
    public void attack() {
        System.out.println("망나뇽 환상적인 바디 블로");
    }
}
