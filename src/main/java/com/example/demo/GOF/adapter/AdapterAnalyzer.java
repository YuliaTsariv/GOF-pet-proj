package com.example.demo.GOF.adapter;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class AdapterAnalyzer implements JsonDataAnalyzer {
    XMLData xmlData;

    public AdapterAnalyzer(XMLData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public void analyzeData() {
        log.info("Convert xmlData:{} to data to json ", xmlData);
        log.info("Analyze data");
    }
}
