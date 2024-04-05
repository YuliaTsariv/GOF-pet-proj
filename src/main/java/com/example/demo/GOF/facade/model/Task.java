package com.example.demo.GOF.facade.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Task {
    private int taskId;
    private String taskName;
    private String description;
    private int priority;
    private boolean isCompleted;
    private String assignedTo;
    private String deadline;
}
