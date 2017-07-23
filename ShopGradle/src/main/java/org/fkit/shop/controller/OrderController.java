package org.fkit.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.fkit.shop.domain.Order;

import org.fkit.shop.service.CartService;
import org.fkit.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;
	@Autowired
	@Qualifier("cartService")
	private CartService cartService;
	@RequestMapping(value="/order")
	public String order(Model model){
	        // 获得所有图书集合
			List<Order> order_list = orderService.getAll();
			// 将图书集合添加到model当中		
			model.addAttribute("order_list", order_list);
			// 跳转到order页面
			return "orderForm";
			}
	//添加订单
			
				@RequestMapping(value = "/saveorder")
				public String saveorder(
						@ModelAttribute Order order,
						HttpSession session,Integer count,Integer goods_id,
						HttpServletRequest request,Model model){
				
					//String goods_id = request.getParameter("goods_id");
					//int goods_id_ = Integer.parseInt(goods_id);
					
					//Order order=orderService.findOrder(goods_id);
					//if (order == null) {
					int c=	orderService.saveOrder(order);				
					//}else {			
						//orderService.addOrder(goods_id_);				
					//}
				
					
					cartService.removeCart(goods_id);
				orderService.change(goods_id, count);
					List<Order> order_list = orderService.getAll();
					// 将图书集合添加到model当中
					model.addAttribute("order_list", order_list);
					// 跳转到cart页面
					return "orderForm";
				}
			
			//删除订单的东西
			@RequestMapping(value="/removeorder")
			public String removeorder(Model model,HttpServletRequest request){
				String goods_id = request.getParameter("goods_id");
				int goods_id_ = Integer.parseInt(goods_id);
				orderService.removeOrder(goods_id_);
				List<Order> order_list = orderService.getAll();
				// 将图书集合添加到model当中
				model.addAttribute("order_list", order_list);
				// 跳转到order页面
				return "orderForm";
				}
			@RequestMapping(value="/orderlist")
			public String orderlist(Model model){
			        // 获得所有图书集合
					List<Order> order_list = orderService.getAll();
					// 将图书集合添加到model当中		
					model.addAttribute("order_list", order_list);
					// 跳转到order页面
					return "orderlist";
					}
			
			
			@RequestMapping(value="/buy")
			public String buy(Model model,HttpServletRequest request){
				String goods_id = request.getParameter("goods_id");
				int goods_id_ = Integer.parseInt(goods_id);
				orderService.removeOrder(goods_id_);
				return"evaluation";
			}
		
}
