package cn.itcast.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/*.xml")
public class UserServiceTest {
	@Autowired
	private UserService userService1;

	@Test
	public void test() throws Exception {
		for (int i = 0; i < 99999999; i++) {
			List<User> list = this.userService1.queryAll();
			for (User user : list) {
				System.out.println(user);
			}
			Thread.sleep(500);
		}
	}

}
