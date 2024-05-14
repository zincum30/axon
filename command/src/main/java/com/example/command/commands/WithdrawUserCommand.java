package com.example.command.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@AllArgsConstructor
@ToString
@Getter
public class WithdrawUserCommand {
    @TargetAggregateIdentifier
    private Long userId;
}
