package com.kiosk.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kiosk.web.common.Common;
import com.kiosk.web.service.dao.BergerDAO;
import com.kiosk.web.service.dao.DrinkDAO;
import com.kiosk.web.service.dao.SetBergerDAO;
import com.kiosk.web.service.dao.SideMenuDAO;
import com.kiosk.web.service.dto.BergerVO;
import com.kiosk.web.service.dto.DrinkVO;
import com.kiosk.web.service.dto.SetBergerVO;
import com.kiosk.web.service.dto.SideMenuVO;

@Controller
public class BergerController {

	BergerDAO berger_dao;
	SetBergerDAO sBerger_dao;
	SideMenuDAO sideMenu_dao;
	DrinkDAO drink_dao;
	
	public void setBerger_dao(BergerDAO berger_dao) {
		this.berger_dao = berger_dao;
	}

	public void setsBerger_dao(SetBergerDAO sBerger_dao) {
		this.sBerger_dao = sBerger_dao;
	}
	
	public void setSideMenu_dao(SideMenuDAO sideMenu_dao) {
		this.sideMenu_dao = sideMenu_dao;
	}
	
	public void setDrink_dao(DrinkDAO drink_dao) {
		this.drink_dao = drink_dao;
	}

	@Autowired
	HttpServletRequest request;


	@RequestMapping("/setBerger.do")
	public String setBerger(Model model) {
		System.out.println("세트불러쪄?");

		List<SetBergerVO> setBerger = null;
		setBerger = sBerger_dao.getList();
		model.addAttribute("setBerger", setBerger);
		
		List<DrinkVO> drink = null;
		drink = drink_dao.getList();
		model.addAttribute("drink", drink);
		
		List<SideMenuVO> sideMenu = null;
		sideMenu = sideMenu_dao.getList();
		model.addAttribute("sideMenu", sideMenu);
		
		List<BergerVO> berger = null;
		berger = berger_dao.getList();
		model.addAttribute("berger", berger);

		return Common.VIEW_PATH + "main.jsp";
	}
	
	
}
