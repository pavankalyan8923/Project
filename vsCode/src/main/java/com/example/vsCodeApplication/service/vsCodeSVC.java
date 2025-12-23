package com.example.vsCodeApplication.service;

import org.springframework.stereotype.Service;

import scala.collection.mutable.HashMap;

@Service
public class vsCodeSVC {

    public String getGreeting() {
        return "Hello from vsCodeSVC!";
    }

    public HashMap<String, String> getData() {
        HashMap<String, String> sampleData = new HashMap<>();
        sampleData.put("key1", "value1");
        sampleData.put("key2", "value2");
        return sampleData;
    }

}
