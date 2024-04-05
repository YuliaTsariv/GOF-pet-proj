package com.example.demo.GOF.adapter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class AdapterPatternApplication {

    public static void main(String[] args) {
        JsonDataAnalyzer jsonDataAnalyzer = new AdapterAnalyzer(new XMLData());
        jsonDataAnalyzer.analyzeData();
    }

}
