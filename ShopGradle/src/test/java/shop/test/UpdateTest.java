package shop.test;

import static org.junit.Assert.*;

import java.util.List;

import org.fkit.shop.domain.Goods;
import org.fkit.shop.domain.Order;
import org.fkit.shop.service.GoodsService;
import org.fkit.shop.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/spring-config.xml"})
public class UpdateTest {
	 @Autowired
	    private OrderService orderService;
	
	@Test
	public void test() {
		
		orderService.change(3,2);
	}

}
