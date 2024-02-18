package com.example.demo.GOF.factory;

import lombok.Data;

@Data
public class Session implements Game {
    private String name;
    private Long id;

    public Session(String name, Long id){
        this.name=name;
        this.id=id;
    }
}
