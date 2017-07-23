package org.fkit.shop.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;


import org.fkit.shop.domain.User;
import org.fkit.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 处理用户请求控制器
 * */
@Controller
public class UserController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 处理/login请求
	 * */
	@RequestMapping(value="/login")
	 public ModelAndView login(
			 String loginname,String password,
			 ModelAndView mv,HttpServletRequest request,
			 
			 HttpSession session){
		
		
		// 根据登录名和密码查找用户，判断用户登录
		User user = userService.login(loginname, password);
		if(user != null){
			request.getSession().setAttribute("user_id",user.getId());
			System.out.print(user.getId());
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			// 转发到main请求
			mv.setView(new RedirectView("defaultForm"));
			
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("loginForm");
		}
		return mv;
	}
	
	@RequestMapping(value="/save")
	public ModelAndView save(
			@ModelAttribute User user,
			ModelAndView mv,
			 HttpSession session){
		int count=userService.addUser(user);
		mv.addObject("message", "注册成功，请登陆!");
		mv.setViewName("loginForm");
	return mv;
	
	
}
	@RequestMapping(value="/update")
	public ModelAndView update(
			@ModelAttribute User user,
			ModelAndView mv,
			 HttpSession session	){
		mv.setView(new RedirectView("UpdatePasForm"));
		int update=  userService.updateUser(user);
		mv.addObject("message", "修改成功!");
		mv.setViewName("defaultForm");
	return mv;
}
	@RequestMapping(value="/find")
	@ResponseBody
	public Map forgetPass(HttpServletRequest request,String loginname,HttpSession session){
		
		User user=userService.find(loginname);
		HashMap<String, String> map=new HashMap<String,String>();
		String msg="";
		if(user==null){
			msg="用户名不存在,你不会忘记用户名了吧?";
			map.put("msg", msg);
			return map;
		}try{
			
			String emailTitle="密码找回";
			
			session.setAttribute("user", user);
			String emailContent="<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" /></head><body>"
					+ "<br/><font color='red'>" + user + "</font><br/><br/></body></html>";
			

			System.out.println(user);
			SendMail sendMail=new SendMail();
			sendMail.sendHtmlMail(emailTitle,emailContent,user.getLoginname());
			msg="操作成功,已经发送找回密码链接到您邮箱。请在30分钟内重置密码";
			
		}catch(Exception e){
			e.printStackTrace();
			msg="邮箱不存在？未知错误,联系管理员吧。";
			
		}
		map.put("msg", msg);
		return map;
	}

	
}
