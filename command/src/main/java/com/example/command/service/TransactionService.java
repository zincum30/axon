package com.example.command.service;

import com.example.command.commands.CreateUserCommand;
import com.example.command.dto.CreateUserDto;
import lombok.RequiredArgsConstructor;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final CommandGateway commandGateway;

    public CompletableFuture<String> createUser(CreateUserDto createUserDto) {
        return commandGateway.send(new CreateUserCommand(
                createUserDto.getName(),
                createUserDto.getNickname(),
                createUserDto.getEmail(),
                createUserDto.getPassword()));
    }
}
