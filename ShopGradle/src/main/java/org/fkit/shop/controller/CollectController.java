package org.fkit.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.fkit.shop.domain.Cart;
import org.fkit.shop.domain.Collect;
import org.fkit.shop.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CollectController {
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Autowired
	@Qualifier("collectService")
	private CollectService collectService;

	@RequestMapping(value="/collect")
	public String collect(Model model){
		// 获得所有图书集合
				List<Collect> collect_list=collectService.getAll();
				model.addAttribute("collect_list",collect_list);
				//返回收藏的页面
		return "collect";
		
	}
	//全部清空
		@RequestMapping(value = "/clearcollect")
		public String clearcollect(Model model) {
			collectService.clearCollect();
			List<Collect> collect_list = collectService.getAll();
			// 将图书集合添加到model当中
			model.addAttribute("collect_list", collect_list);
			// 跳转到collect页面
			return "collect";
}
	//添加收藏
		@RequestMapping(value = "/savecollect")
		public String savecollect(HttpServletRequest request,
				ModelAndView mv,Model model) {
			String goods_id = request.getParameter("goods_id");
			int goods_id_ = Integer.parseInt(goods_id);
		   
		    Collect collect=collectService.findCollect(goods_id_);
			if (collect == null) {
				 collectService.saveCollect(goods_id_);	
			}else {			
				mv.addObject("message", "该商品已收藏!");
			}
			List<Collect> collect_list = collectService.getAll();
			// 将图书集合添加到model当中
			model.addAttribute("collect_list", collect_list);
			// 跳转到collect页面
			return "collect";
}
		//取消收藏
		@RequestMapping(value="/removecollect")
		public String removecollect(Model model,HttpServletRequest request){
			String goods_id = request.getParameter("goods_id");
			
			int goods_id_ = Integer.parseInt(goods_id);
			collectService.removeCollect(goods_id_);
			List<Collect> collect_list = collectService.getAll();
			// 将图书集合添加到model当中
			model.addAttribute("collect_list", collect_list);
			// 跳转到collect页面
			return "collect";
		}
}