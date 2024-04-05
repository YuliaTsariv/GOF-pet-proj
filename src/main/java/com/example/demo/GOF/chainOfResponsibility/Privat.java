package com.example.demo.GOF.chainOfResponsibility;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Privat extends Account{
    public Privat(Priority priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void handleProcess(Long payment) {
        log.info("Handle payment with privat" + payment);
    }
}
