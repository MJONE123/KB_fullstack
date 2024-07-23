package org.example;

import java.util.Objects;

// 나머지는 인텔리제이 insert가 다 알아서 해주지만 이것만큼은 테이블 보고 잘 입력해야 한다.
public class UserVo1 {
    int id;
    String email;
    String password;

//    constructor
    public UserVo1(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

//    getter
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

//    setter
    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    tostring overiding
    @Override
    public String toString() {
        return "UserVo{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

//    equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserVo1 userVo = (UserVo1) o;
        return id == userVo.id && Objects.equals(email, userVo.email) && Objects.equals(password, userVo.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password);
    }
}
