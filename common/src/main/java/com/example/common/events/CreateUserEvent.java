package com.example.common.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class CreateUserEvent {
    private String name;
    private String nickname;
    private String email;
    private String password;
}
