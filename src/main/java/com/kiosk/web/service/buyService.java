package com.kiosk.web.service;

import java.util.List;

import com.kiosk.web.service.dto.BuyVO;

public interface buyService {

	List<BuyVO> getList();
	
	int insert(BuyVO buyVo) ;
}
