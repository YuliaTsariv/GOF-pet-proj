package com.example.demo.GOF.chainOfResponsibility;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Mono extends Account {

    public Mono(Priority priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void handleProcess(Long payment) {
        log.info("Handle payment with mono" + payment);
    }
}
