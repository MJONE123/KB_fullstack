package org.example.dto.member;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
//@RequiredArgsConstructor
public class MemberRepository {
    private MemberMapper memberMapper;

    public List<MemberDto> findAll() {
        return memberMapper.findAll();
    }
}