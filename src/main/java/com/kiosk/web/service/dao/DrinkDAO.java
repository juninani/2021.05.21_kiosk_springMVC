package com.kiosk.web.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kiosk.web.service.DrinkService;
import com.kiosk.web.service.dto.DrinkVO;

public class DrinkDAO implements DrinkService{
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<DrinkVO> getList() {
		
		List<DrinkVO> list = null;

		list = sqlSession.selectList("drink.drink_list");
		return list;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(DrinkVO drinkVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(DrinkVO drinkVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int idx) {
		// TODO Auto-generated method stub
		return 0;
	}



}
