package com.kiosk.web.service;

import java.util.List;

import com.kiosk.web.service.dto.DrinkVO;

public interface DrinkService {

	List<DrinkVO> getList();

	int getCount();

	int insert(DrinkVO drinkVo) ;

 	int update(DrinkVO drinkVo); 
	
 	
	int delete(int idx);
	
}
