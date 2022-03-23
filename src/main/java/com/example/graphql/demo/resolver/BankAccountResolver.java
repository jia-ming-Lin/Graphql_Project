package com.example.graphql.demo.resolver;

import java.util.UUID;

import com.example.graphql.demo.domain.bank.Currency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import com.example.graphql.demo.domain.bank.BankAccount;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {
    public BankAccount bankAccount(UUID id) {
        log.info("Retreieve ban acoount: {}", id);

		return  BankAccount.builder().id(id).name("Steve").build();
    }
}
