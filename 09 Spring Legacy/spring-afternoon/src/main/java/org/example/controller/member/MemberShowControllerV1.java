package org.example.controller.member;


import lombok.extern.slf4j.Slf4j;
import org.example.dto.member.MemberDtoListV1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
public class MemberShowControllerV1 {
    private MemberDtoListV1 memberList = MemberDtoListV1.getInstance();

    @GetMapping("/member/show")
    public String process(HttpServletRequest req, HttpServletResponse resp) {
        log.info("==========> 회원 목록 조회 페이티 호출, /member/show");

        req.setAttribute("memberList", memberList.getList());
        return "member-show";
    }
}
