package org.example.controller.member;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.member.MemberDtoListV1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j

public class MemberSaveControllerV2 {
    private MemberDtoListV1 memberList = MemberDtoListV1.getInstance();

    @RequestMapping(value = "/member/form/save", method = RequestMethod.GET)
    public String process(HttpServletRequest req, HttpServletResponse resp) {
        log.info("==========> 회원 추가 Request 호출, /member/form/save");

        String id = req.getParameter("id");
        String name = req.getParameter("name");

        memberList.addList(id, name);
        req.setAttribute("memberList", memberList.getList());
        return "member-show2";

    }
}

