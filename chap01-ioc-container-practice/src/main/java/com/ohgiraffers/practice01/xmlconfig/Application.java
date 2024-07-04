package com.ohgiraffers.practice01.xmlconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(IoCContainer.class);
        BoardDTO board = context.getBean("Board",BoardDTO.class);

        System.out.println(board);

    }

}
