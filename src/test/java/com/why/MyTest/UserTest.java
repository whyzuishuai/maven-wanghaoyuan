package com.why.MyTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.why.dao.UserDao;
import com.why.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class UserTest {
			@Autowired
			private UserDao userdao;
			
			@Test
			public void myuser() {
				List<User> select = userdao.select(null);
				for (User user : select) {
					System.out.println("+++++++++++++++++++++++++++"+user);
				}
			}
			
}