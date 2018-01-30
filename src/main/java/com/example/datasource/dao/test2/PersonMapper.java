package com.example.datasource.dao.test2;

import com.example.datasource.domain.Person;
import com.example.datasource.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapper {

    Person getUserById(String userId);
}
