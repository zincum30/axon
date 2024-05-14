package com.example.command.controller;

import com.example.command.dto.CreateUserDto;
import com.example.command.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequiredArgsConstructor
public class TransactionController {
    private final TransactionService transactionService;

    @PostMapping("/join")
    public CompletableFuture<String> createUser(@RequestBody CreateUserDto createUserDto) {
        return transactionService.createUser(createUserDto);
    }
}
