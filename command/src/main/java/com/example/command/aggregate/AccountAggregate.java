package com.example.command.aggregate;

import com.example.command.commands.CreateUserCommand;
import com.example.command.commands.WithdrawUserCommand;
import com.example.common.events.CreateUserEvent;
import com.example.common.events.WithdrawUserEvent;
import lombok.RequiredArgsConstructor;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import static org.axonframework.modelling.command.AggregateLifecycle.apply;

@RequiredArgsConstructor
@Aggregate
public class AccountAggregate {
    @AggregateIdentifier
    private String name;
    private String nickname;
    private String email;
    private String password;

    @CommandHandler
    public AccountAggregate(CreateUserCommand command) {
        apply(new CreateUserEvent(
                command.getName(),
                command.getNickname(),
                command.getEmail(),
                command.getPassword()));
    }

    @EventSourcingHandler
    protected void createUser(CreateUserEvent event) {
        this.name = event.getName();
        this.nickname = event.getNickname();
        this.email = event.getEmail();
        this.password = event.getPassword();
    }


}
