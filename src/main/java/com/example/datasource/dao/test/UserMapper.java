package com.example.datasource.dao.test;

import com.example.datasource.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User getUserById(String userId);
}
