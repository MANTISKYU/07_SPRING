package com.ohgiraffers.common;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MemberDTO {


    private Long id;
    private String nickname;
    private IocContainer iocContainer;
}
