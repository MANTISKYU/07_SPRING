package com.ohgiraffers.common;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class MemberDTO {

    private int sequence;
    private String name;
    private String phone;
    private String email;
    private PersonalAccount personalAccount;

}
