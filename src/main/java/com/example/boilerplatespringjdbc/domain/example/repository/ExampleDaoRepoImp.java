package com.example.boilerplatespringjdbc.domain.example.repository;

import com.example.boilerplatespringjdbc.domain.example.entity.Example;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

// 모든 repository를 쉽게 사용 할 수 있도록 한  CrudRepository Interface 가 존재 한다. 따라서 기본적으로 이 Interface를 구현하는 것이 좋지만
// sql 을 직접 작성해 보면서 Database 쿼리 공부도 같이 하자
@Repository
@RequiredArgsConstructor
public class ExampleDaoRepoImp implements ExampleDaoRepo {

    private final NamedParameterJdbcTemplate jdbc;

    // DB 테이블에서 로드한 Row 데이터를 대상으로
    // Role Bean의 Setter 메서드에 맞춰 매핑한 객체를 반환해주는 RowMapper 객체 생성
    private final RowMapper<Example> rowMapper = BeanPropertyRowMapper.newInstance(Example.class);

    public List<Example> selectAll() {
        String sql = "SELECT * FROM Example";
        try{
            return jdbc.query(sql, Collections.emptyMap(), rowMapper);
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return new ArrayList<>();
    }
}
