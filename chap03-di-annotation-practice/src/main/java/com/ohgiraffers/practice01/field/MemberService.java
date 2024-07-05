package com.ohgiraffers.practice01.field;


import com.ohgiraffers.common.MemberDTO;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("serviceCollection")
public class MemberService {

    private MemberDAO memberDAO;

    public Map<Long, MemberDTO> selectMember() {
        return memberDAO.selectMember();
    }

}
