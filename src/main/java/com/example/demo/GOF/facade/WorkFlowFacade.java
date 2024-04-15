package com.example.demo.GOF.facade;

import com.example.demo.GOF.facade.model.Network;
import com.example.demo.GOF.facade.model.Resource;
import com.example.demo.GOF.facade.model.Task;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class WorkFlowFacade {
    ResourceLoader resourceLoader = new ResourceLoader();
    TaskExecutor taskExecutor = new TaskExecutor();
    NetworkUtils networkUtils = new NetworkUtils();

    public void startWorkFlow() {
        var nodeNames = List.of("Node1", "Node2", "Node3");
        var network = new Network("LocalNetwork", 3, nodeNames, true);
        var task = new Task(1, "Implement feature", "Implement new feature X", 2, false, "John Doe", "2024-02-28");
        var categories = List.of("Hardware", "Software");
        var resource = new Resource("Laptop", 10, "Room 101", categories, true);

        networkUtils.checkNetworkConnection(network);
        resourceLoader.loadResources(resource);
        taskExecutor.executeTasks(task);
    }
}
