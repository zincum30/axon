package com.example.command.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import org.checkerframework.checker.units.qual.A;

@AllArgsConstructor
@ToString
@Getter
public class CreateUserCommand {
    @TargetAggregateIdentifier
    private String name;
    private String nickname;
    private String email;
    private String password;
}
