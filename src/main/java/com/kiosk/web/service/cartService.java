package com.kiosk.web.service;

import java.util.List;

import com.kiosk.web.service.dto.CartVO;

public interface cartService {

	List<CartVO> getList();
	
	public int delete(int idx);
	public void allDelete();
	int insert(CartVO cartVo);
	public CartVO selectOne(CartVO vo);
	public int getPrice();
}
