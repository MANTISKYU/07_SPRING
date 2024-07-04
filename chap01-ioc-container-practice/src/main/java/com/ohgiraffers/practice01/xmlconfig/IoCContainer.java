package com.ohgiraffers.practice01.xmlconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IoCContainer {

    @Bean("Board")
    public BoardDTO Board() {

        System.out.println("BoardDTO 호출");
        return new BoardDTO(1234, "으하하", "메렁메렁", "집에보내주세요");

    }

}
