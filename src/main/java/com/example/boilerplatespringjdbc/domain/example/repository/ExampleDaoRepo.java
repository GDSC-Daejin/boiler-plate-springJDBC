package com.example.boilerplatespringjdbc.domain.example.repository;

import com.example.boilerplatespringjdbc.domain.example.entity.Example;
import org.springframework.stereotype.Repository;

import java.util.List;

// 항상 인터페이스에서 선언하고 구현하기
// 왜냐면 디비를 갈아낄수가 있어요 여러 구현체를 만들고 인터페이스로 불러오면 자동으로 맞는 놈을 해줘요 그래서 인터페이스로 불러오기만 하면 되요
@Repository
public interface ExampleDaoRepo  {

    List<Example> selectAll();
}
