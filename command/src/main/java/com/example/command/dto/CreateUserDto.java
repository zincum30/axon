package com.example.command.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserDto {

    private String name;
    private String nickname;
    private String email;
    private String password;
}
