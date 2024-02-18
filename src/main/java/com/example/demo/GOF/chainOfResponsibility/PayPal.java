package com.example.demo.GOF.chainOfResponsibility;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PayPal extends Account{
    public PayPal(Priority priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void handleProcess(Long payment) {
        log.info("Handle payment with paypal" + payment);
    }
}
