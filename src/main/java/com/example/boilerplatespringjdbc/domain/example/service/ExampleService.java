package com.example.boilerplatespringjdbc.domain.example.service;

import com.example.boilerplatespringjdbc.domain.example.dto.ExampleQuantityResponseDto;
import com.example.boilerplatespringjdbc.domain.example.entity.Example;
import com.example.boilerplatespringjdbc.domain.example.repository.ExampleDaoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public
class ExampleService {
    private final ExampleDaoRepo exampleDaoRepo;

    public List<Example> selectAll() {
        return exampleDaoRepo.selectAll();
    }
    public ExampleQuantityResponseDto howManyList(){
        return ExampleQuantityResponseDto.builder()
                .quantity(Long.valueOf(exampleDaoRepo.selectAll().size()))
                .build();
    }
}
