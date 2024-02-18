package com.example.demo.GOF.facade;

import com.example.demo.GOF.facade.model.Task;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class TaskExecutor {
    public void executeTasks(Task task) {
        log.info("Executing task " + task);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Tasks executed successfully.");
    }
}
