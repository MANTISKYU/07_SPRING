package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        // XML 설정 파일을 기반으로 ApplicationContext 생성
        ApplicationContext context =
                new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");


        MemberDTO member = context.getBean(MemberDTO.class);

        System.out.println(member);

        // Member DTO의 PersonalAccount 객체 출력
        System.out.println(member.getPersonalAccount());

        // 10000원 입금
        System.out.println(member.getPersonalAccount().deposit(10000));

        // 잔액 출력
        System.out.println(member.getPersonalAccount().getBalance());

        // 5000원 출금
        System.out.println(member.getPersonalAccount().withDraw(5000));

        // 잔액 출력
        System.out.println(member.getPersonalAccount().getBalance());

        // Member에서 꺼내온 Personal Account
        //PersonalAccount(bankCode=20, accNo=110-234-56780, balance=110-234-56780 계좌의 현재 잔액은 0원 입니다.)

        //PersonalAccount(bankCode=20, accNo=110-234-56780, balance=110-234-56780 계좌의 현재 잔액은 0원 입니다.)
    }
}