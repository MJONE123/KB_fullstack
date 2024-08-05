package org.example.dto;

import java.util.ArrayList;
import java.util.List;

public class MemberDTOListV1 {
    private static MemberDTOListV1 instance;
    private List<MemberDTO> memberDTOList;

    private MemberDTOListV1() {
        this.memberDTOList = new ArrayList<>();

        // 테스트 데이터 추가
        this.addList("tetz", "이효석");
        this.addList("joonil", "문준일");
    }

    //
    public static synchronized MemberDTOListV1 getInstance() {
        if (instance == null) {
            instance = new MemberDTOListV1();
        }
        return instance;
    }

    private void addList(String id, String name) {
        memberDTOList.add(new MemberDTO(id, name));
    }

    public List<MemberDTO> getList() {
        return memberDTOList;
    }

}
