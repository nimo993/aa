package org.fkit.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.fkit.shop.domain.Collect;
import org.fkit.shop.domain.Goods;
import org.fkit.shop.domain.Remark;
import org.fkit.shop.domain.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.fkit.shop.service.GoodsService;
@Controller
public class GoodsController {

/**
 * 自动注入GoodService
 * */
@Autowired
@Qualifier("goodsService")

private GoodsService goodsService;

/**
 * 处理/main请求
 * */
@RequestMapping(value="/drinking")
public String main(Model model){
List<Goods> goods_list = goodsService.getAll();
// 将图书集合添加到model当中
model.addAttribute("goods_list", goods_list);
// 跳转到wenyibook页面
return "drinkings";
	
}
@RequestMapping(value = "/evaluation")
public String evaluation( ModelAndView mv ,@ModelAttribute Remark remark) {
	int b=goodsService.insert(remark);
	mv.addObject("message", "评价成功!");
	return "defaultForm";
}
@RequestMapping(value="/goodslist")
public String goodlist(Model model){
List<Goods> goods_list = goodsService.getAll();
// 将图书集合添加到model当中
model.addAttribute("goods_list", goods_list);
// 跳转到wenyibook页面
return "goodslist";
}
@RequestMapping(value = "/insertgoods")
public ModelAndView insertgoods(@ModelAttribute Goods goods, 
		ModelAndView mv ) {
	int a=goodsService.insertgoods( goods);
	mv.setView(new RedirectView("./goodslist"));
	return mv;
}
@RequestMapping(value="/deletegoods")
public ModelAndView deletegoods(@ModelAttribute Goods goods,
		ModelAndView mv,HttpServletRequest request){
	int id = Integer.parseInt(request.getParameter("id"));
	goods.setId(id);
	int count=goodsService.deletegoods(id);
	mv.setView(new RedirectView("./goodslist"));
	return mv;
}
@RequestMapping(value="/select")
public ModelAndView select(
		 int id,
		 ModelAndView mv,
		 HttpSession session){
	Goods goods=goodsService.selectGoods(id);
	System.out.print("id");
	session.setAttribute("goods", goods);
	mv.setViewName("RIO");
	return mv;
}





}
