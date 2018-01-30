package com.example.datasource;

import com.example.datasource.dao.test.UserMapper;
import com.example.datasource.dao.test2.PersonMapper;
import com.example.datasource.domain.Person;
import com.example.datasource.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatasourceApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private PersonMapper persionMapper;

	@Test
	public void contextLoads() {

		User user = userMapper.getUserById("c");
		System.out.println(user);
		Person person = persionMapper.getUserById("1");
		System.out.println(person);
		User user1 = userMapper.getUserById("d");
		System.out.println(user1);
		Person person1 = persionMapper.getUserById("2");
		System.out.println(person1);
	}

}
