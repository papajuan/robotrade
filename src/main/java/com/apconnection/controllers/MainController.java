package com.apconnection.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author papajuan
 * 06.12.2019
 */

@RestController
public class MainController {

    @GetMapping("/")
    public String getMain() {
        return "Hello world";
    }
}