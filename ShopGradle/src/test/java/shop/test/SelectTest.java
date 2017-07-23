package shop.test;

import static org.junit.Assert.*;

import org.fkit.shop.domain.User;

import org.fkit.shop.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/spring-config.xml"})
public class SelectTest {
	@Autowired
    private UserService userService;
	@Test
	public void testUserController() {
		User user = userService.login("2814440755@qq.com", "12345");
	 System.out.println(user);
	}

}
