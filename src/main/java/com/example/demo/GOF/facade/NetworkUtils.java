package com.example.demo.GOF.facade;

import com.example.demo.GOF.facade.model.Network;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class NetworkUtils {
    public void checkNetworkConnection(Network network) {
        log.info("Checking network {} connection...", network);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Network connection is active.");
    }
}
