package com.kiosk.web.service;

import java.util.List;

import com.kiosk.web.service.dto.SideMenuVO;

public interface SideMenuService {
	List<SideMenuVO> getList();

	int getCount();

	int insert(SideMenuVO sideMenu) ;

 	int update(SideMenuVO sideMenu); 
	
 	
	int delete(int idx);
}
