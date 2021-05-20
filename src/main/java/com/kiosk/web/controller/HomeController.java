package com.kiosk.web.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kiosk.web.common.Common;

@Controller
public class HomeController {
	


	@Autowired
	HttpServletRequest request;

	
	@RequestMapping(value= "/" ,method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "setBerger.do";
	}
}
