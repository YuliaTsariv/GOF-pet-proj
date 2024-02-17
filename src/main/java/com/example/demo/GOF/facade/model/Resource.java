package com.example.demo.GOF.facade.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Resource {
    private String resourceName;
    private int quantity;
    private String location;
    private List<String> categories;
    private boolean isAvailable;
}
