package ch12.sec03.exam05;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Member {
    private String name;
    private int age;
    private String Id;
}
