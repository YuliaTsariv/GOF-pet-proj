package com.example.demo.GOF.facade;

import com.example.demo.GOF.facade.model.Resource;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class ResourceLoader {

    public void loadResources(Resource resource) {
        log.info("Loading resources " + resource);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Resources loaded successfully.");
    }
}
