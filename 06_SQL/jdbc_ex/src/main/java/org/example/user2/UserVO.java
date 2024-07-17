package org.example.user2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

//Data 어노테이션은 자동으로 getter/setter, equals, hashcode 메서드를 생성해준다.
@Data

//모든 필드를 포함한 생성자를 만들어줌.
@AllArgsConstructor
public class UserVO {
    private final int id;
    private final String userid;
    private final String name;
    private final String password;
    private final int age;
    private final boolean membership;
    private final Timestamp signupDate;

}

