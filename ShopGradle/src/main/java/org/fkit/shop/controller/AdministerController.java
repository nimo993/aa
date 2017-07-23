package org.fkit.shop.controller;

import java.util.HashMap;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.fkit.shop.domain.Administer;

import org.fkit.shop.domain.Order;
import org.fkit.shop.domain.User;
import org.fkit.shop.service.AdministerService;
import org.fkit.shop.service.OrderService;
import org.fkit.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class AdministerController {
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("administerService")
	private AdministerService administerService;
	@Qualifier("orderService")
	private OrderService orderService;
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 处理/login请求
	 * */
	@RequestMapping(value="/aloginForm")
	 public ModelAndView aloginForm(
			 String loginname,String password,
			 ModelAndView mv,
			 HttpSession session,Model model){
		// 根据登录名和密码查找用户，判断用户登录
		Administer administer = administerService.alogin(loginname, password);
		if(administer != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("administer", administer);
			// 转发到main请求
			mv.setView(new RedirectView("./goodslist"));
			
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("aloginForm");
		}
		return mv;
	}
	
	
	@RequestMapping(value="/begin")
	@ResponseBody
	public Map inform(@ModelAttribute Order order,HttpServletRequest request,Integer user_id,
			HttpSession session,Model model){
		String state="已发货";
		order.setState(state);
		
		int goods_id= Integer.parseInt(request.getParameter("goods_id"));
		System.out.println(user_id);
		User user=userService.findName(user_id);
		System.out.println(user);
		System.out.println(state);
		administerService.begin(state,goods_id);

		HashMap<String, String> map=new HashMap<String,String>();
		String msg="";
		if(user==null){
			msg="用户名不存在,你不会忘记用户名了吧?";
			map.put("msg", msg);
			return map;
		}try{
			
			String emailTitle="订单状态通知";
			
			session.setAttribute("user", user);
			String emailContent="亲爱的顾客，您购买的商品已发货";
			

			
			SendMail sendMail=new SendMail();
			sendMail.sendHtmlMail(emailTitle,emailContent,user.getLoginname());
			msg="操作成功,已经发送订单状态到您邮箱。";
			
		}catch(Exception e){
			e.printStackTrace();
			msg="邮箱不存在？未知错误,联系管理员吧。";
			
		}
		map.put("msg", msg);
		return map;
		
	}
	
	
}