package com.ohgiraffers.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BoardDTO {

    private long id;
    private String title;
    private String content;
    private String writer;

}
