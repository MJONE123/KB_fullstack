package org.example.todo2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class UserVO {
    private String user_id;
    private String name;
    private String password;
    private Timestamp created_at;
}


