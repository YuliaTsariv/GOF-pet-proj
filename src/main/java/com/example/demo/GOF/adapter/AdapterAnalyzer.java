package com.example.demo.GOF.adapter;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.json.XML;

@Slf4j
@Data
public class AdapterAnalyzer implements JsonDataAnalyzer {
    XMLData xmlData;

    public AdapterAnalyzer(XMLData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public void analyzeData() {
        String xmlString = xmlData.getXmlData();
        JSONObject jsonObject = XML.toJSONObject(xmlString);
        String jsonData = jsonObject.toString();
        log.info("Analyze JSON data: {}", jsonData);
    }
}
