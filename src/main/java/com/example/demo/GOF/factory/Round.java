package com.example.demo.GOF.factory;

import lombok.Data;

@Data
public class Round implements Game {
    private String name;
    private Long id;

    public Round(String name, Long id) {
        this.name = name;
        this.id = id;
    }
}
