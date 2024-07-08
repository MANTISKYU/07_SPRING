package com.ohgiraffers.section01.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01.aop");

        MemberService memberService =
                (MemberService) context.getBean("memberService");

//        System.out.println("============ selectAllMembers ============");
//        System.out.println(memberService.selectMembers());

        System.out.println("============ selectMemberById ============");
        System.out.println(memberService.selectMember(1L));
    }

    /*
    *
    * */
    @AfterThrowing(pointcut = "logPointcut()", throwing = "exception")
    public void logAfterThrowing (Throwable exception) {
        System.out.println("After Throwing exception = " + exception);
    }

}