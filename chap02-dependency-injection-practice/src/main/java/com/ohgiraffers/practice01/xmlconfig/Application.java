package com.ohgiraffers.practice01.xmlconfig;


import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers");

        MemberDTO member = context.getBean(MemberDTO.class);

        System.out.println(member);





    }

}
