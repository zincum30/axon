package com.example.common.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class WithdrawUserEvent {
    private Long userId;
}
