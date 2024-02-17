package com.example.demo.GOF.chainOfResponsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Account {
    private Long balance;
    private AccountType accountType;

    public void handlePayment(Long pay) {
        if(canPay(pay)){
            log.info("Handle payment with "+accountType);
        }
    }

    private boolean canPay(Long pay) {
        return balance >= pay;
    }
}
