package com.saloed.cloud.cloudappb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @GetMapping("/data")
    public String getData() {
        return "Data from Service B!";
    }
}