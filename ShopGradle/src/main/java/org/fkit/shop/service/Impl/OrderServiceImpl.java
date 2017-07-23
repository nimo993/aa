package org.fkit.shop.service.Impl;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.fkit.shop.service.OrderService;
import org.fkit.shop.domain.Cart;
import org.fkit.shop.domain.Order;
import org.fkit.shop.mapper.CartMapper;
import org.fkit.shop.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("orderService")
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private CartMapper cartMapper;

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return orderMapper.findAll();
	}
	@Override
	public Order findOrder(int goods_id) {
		// TODO Auto-generated method stub
		return orderMapper.findWithId(goods_id);
	}

	
	@Override
	public Order removeOrder(int goods_id) {
		// TODO Auto-generated method stub
		Order order = orderMapper.findWithId(goods_id);
		orderMapper.removeOrder(order);
		return order;
	}
	@Override
	public Order addOrder(int goods_id) {
		// TODO Auto-generated method stub
		Order order = orderMapper.findWithId(goods_id);
		orderMapper.addOrder(order);
		return order;
	}
	
	@Override
	public void change(int goods_id,int count) {
		// TODO Auto-generated method stub
		
		orderMapper.changecount(goods_id,count);
	
	}
	//@Override
	//public Order saveOrder(int goods_id) {
		//TODO Auto-generated method stub
		//Order order = new Order();
	  // order.setGoods_id(goods_id);
	@Override
	public int saveOrder(Order order) {
		// TODO Auto-generated method stub
		return orderMapper.saveOrder(order);
	}
	
	
		
	//final int i = 1;
	//order.setCount(i);
	//final String state="待发货";
	//order.setState(state);
	//orderMapper.saveOrder(order);
		//return order;
	//}
	
	
		
	
}
