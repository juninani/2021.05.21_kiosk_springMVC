package com.kiosk.web.service;

import java.util.List;

import com.kiosk.web.service.dto.BergerVO;


public interface BergerService {
	
	List<BergerVO> getList();

	int getCount();

	int insert(BergerVO bergerVo) ;

 	int update(BergerVO bergerVo); 
	
 	
	int delete(int idx);

}
