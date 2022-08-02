package com.practice.k8s.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/k8s")
public class K8SDemoController {

    @GetMapping("/message")
    @ResponseStatus(HttpStatus.OK)
    public String message() {
        return "Hello K8S !!";
    }
}
