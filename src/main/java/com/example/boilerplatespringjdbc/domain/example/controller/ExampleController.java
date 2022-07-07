package com.example.boilerplatespringjdbc.domain.example.controller;

import com.example.boilerplatespringjdbc.domain.example.entity.Example;
import com.example.boilerplatespringjdbc.domain.example.service.ExampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ExampleController {
    private final ExampleService exampleService;

    @GetMapping("/example/selectAll")
    public List<Example> selectAll() {
        return exampleService.selectAll();
    }

}
