package com.example.demo.GOF.adapter;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class AdapterPatternApplication {

    public static String TEST_XML_STRING =
            "<?xml version=\"1.0\" ?><test attrib=\"moretest\">Turn this to JSON</test>";

    public static void main(String[] args) {
        XMLData xmlData = new XMLData(TEST_XML_STRING);
        JsonDataAnalyzer jsonDataAnalyzer = new AdapterAnalyzer(xmlData);
        jsonDataAnalyzer.analyzeData();
    }

}
