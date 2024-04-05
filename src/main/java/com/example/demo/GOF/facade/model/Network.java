package com.example.demo.GOF.facade.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Network {
    private String name;
    private int numberOfNodes;
    private List<String> nodeNames;
    private boolean isSecure;
}
