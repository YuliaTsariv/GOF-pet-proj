package com.example.demo.GOF.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ProxyApplication {

    public static void main(String[] args) {
        Game session = ConfigFactory.getConfig(ConfigType.SESSION, "Session name", 2L);
        Game round = ConfigFactory.getConfig(ConfigType.ROUND, "Round name", 11L);
        log.info("Received in the resulting factor pattern session: {}", session);
        log.info("Received in the resulting factor pattern round: {}", round);
    }

}
