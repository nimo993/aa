package shop.test;

import org.fkit.shop.domain.Order;
import org.fkit.shop.domain.User;
import org.fkit.shop.service.CartService;
import org.fkit.shop.service.OrderService;
import org.fkit.shop.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/spring-config.xml"})
public class InsertTest {
	 @Autowired
	    private OrderService orderService;
	 @Autowired
	    private UserService userService;
	 
		
	 @Test
	 public void testUserController(){
		 User user=new User();
		 user.setAddress("淮海西路136号");
		 user.setId(6);
		 user.setLoginname("huahua12");
		 user.setPassword("xyw");
		 user.setPhone("");
		 user.setUsername("fool");
		 userService.addUser(user);
	 }
}
