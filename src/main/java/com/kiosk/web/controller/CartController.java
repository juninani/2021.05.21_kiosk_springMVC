package com.kiosk.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kiosk.web.common.Common;
import com.kiosk.web.service.dao.CartDAO;
import com.kiosk.web.service.dto.CartVO;

@Controller
public class CartController {

	CartDAO cart_dao;
	
	public void setCart_dao(CartDAO cart_dao)
	{
		this.cart_dao=cart_dao;
	}
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping("/cart.do")
	public String cart(Model model) {
		System.out.println("장바구니 불러쪄?");
		


		CartVO carVO;
		  List<CartVO> cart = null; 
		  cart = cart_dao.getList();
		
		 
		  model.addAttribute("cart", cart);
		  
		 
		return Common.VIEW_PATH + "cart.jsp";
	}
	@RequestMapping("/insert_cart.do")
	@ResponseBody
	public String insertCart1(CartVO cartVO) {
		System.out.println("카트에 넣어쪄?");		
		CartVO res_vo = cart_dao.selectOne(cartVO);
		String result = "no";
		if(res_vo == null) {
			result = "yes";
			               
			//장바구니에 상품 등록
			cart_dao.insert(cartVO);
		}
		String resultStr = String.format("[{'result':'%s'}]", result);
	
		return resultStr;
		
		
	
	
	}
	
	@RequestMapping("/cart_del.do")
	 public String cartDel(int idx)
	 {
		System.out.println("삭제 불러졌는가");
		
		cart_dao.delete(idx);
		
		return "cart.do";

	 }
	@RequestMapping("/cart_del_all.do")
	 public String allDel()
	 {
		cart_dao.allDelete();
		
		return "setBerger.do";

	 }

	@RequestMapping("/update_cart.do")
	public void update(int idx,int cnt) {
		
		System.out.println("업뎃들어옴");
		//수량 업데이트
		System.out.println(idx);
		System.out.println(cnt);
		cart_dao.update_cnt(idx, cnt);

	}
}
