package org.example;

import java.util.List;

public class UserMain3 {
    public static void main(String[] args) {
        UserDAO2 userDAO2 = new UserDAO2();

        //회원 추가, 이제는 객체를 전달
        UserVo1 newUser = new UserVo1(99999999, "tetz2", "1234");
        userDAO2.addUser(newUser);

        //전체 회원 조회 메서드
        List<UserVo1> users = userDAO2.getAllUsers();

        for (UserVo1 user : users) {
            System.out.println(user);
        }

        //회원 수정
        userDAO2.updateUser(5, "joonil9595", "1234");

        //회원 삭제
        userDAO2.deleteUser(5);


    }
}
