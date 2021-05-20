package com.kiosk.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kiosk.web.common.Common;
import com.kiosk.web.service.dao.BuyDAO;
import com.kiosk.web.service.dao.CartDAO;
import com.kiosk.web.service.dto.BuyVO;

@Controller
public class BuyController {

BuyDAO buy_dao;
CartDAO cart_dao;
	
	public void setBuy_dao(BuyDAO buy_dao)
	{
		this.buy_dao=buy_dao;
	}
	public void setCart_dao(CartDAO cart_dao)
	{
		this.cart_dao=cart_dao;
	}
	@Autowired
	HttpServletRequest request;
	
	
	
	@RequestMapping("/buy.do")
	public String buyInsert(BuyVO buyVO) {
	
		buy_dao.insert(buyVO);
		System.out.println("인설트");
		cart_dao.allDelete();
		
		return"buy_view.do";
	}
	@RequestMapping("/buy_view.do")
	public String view(Model model) {
	
		List<BuyVO> buy = null;
		buy = buy_dao.getList();
		model.addAttribute("buy",buy);
		System.out.println("뷰");
		return Common.VIEW_PATH+"buy.jsp";
	}
	
	
}
