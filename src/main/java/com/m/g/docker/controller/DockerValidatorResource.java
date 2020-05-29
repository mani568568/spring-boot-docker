package com.m.g.docker.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerValidatorResource {

    @GetMapping(value="/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getData()
    {
        return "Successfully Validated Test";
    }
}
