package org.example;

public class UserMain3 {
    public static void main(String[] args) {
        UserDAO2 userDAO2 = new UserDAO2();

        //회원 추가, 이제는 객체를 전달
        UserVo1 newUser = new UserVo1(99999999, "tetz2", "1234");
        userDAO2.addUser(newUser);

    }
}
