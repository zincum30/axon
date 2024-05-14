package com.example.command;


import org.axonframework.commandhandling.CommandHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Objects;

@SpringBootApplication
public class CommandApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommandApplication.class,args);
    }

}