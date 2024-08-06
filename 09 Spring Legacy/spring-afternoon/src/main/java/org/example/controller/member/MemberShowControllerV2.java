package org.example.controller.member;


import lombok.extern.slf4j.Slf4j;
import org.example.dto.member.MemberDtoListV1;
import org.example.dto.member.MemberDtoListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
public class MemberShowControllerV2 {
    private final MemberDtoListV2 memberDtoList;
    //이 부분부터 SpringBean을 쓰면 다른 부분


    @Autowired
    public MemberShowControllerV2(MemberDtoListV2 memberDtoList) {
        this.memberDtoList=memberDtoList;
    }

    @GetMapping("/member/V2/show")
    public String process(HttpServletRequest req, HttpServletResponse resp) {
        log.info("==========> 회원 목록 조회 페이티 호출, /member/show");

        req.setAttribute("memberList", memberDtoList.getList());
        return "member-show";
    }
}
