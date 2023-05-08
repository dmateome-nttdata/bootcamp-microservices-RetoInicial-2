package com.nttdata.bootcamp.configservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${data.data-name}")
    private String myData;

    @GetMapping(path="/getDataName")
    public String myData() {
        return this.myData;
    }
}
