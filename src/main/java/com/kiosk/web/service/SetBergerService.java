package com.kiosk.web.service;

import java.util.List;

import com.kiosk.web.service.dto.SetBergerVO;

public interface SetBergerService {

	List<SetBergerVO> getList();

	int getCount();

	int insert(SetBergerVO setBergerVo) ;

 	int update(SetBergerVO setBergerVo); 
	
 	
	int delete(int idx);
	
}
