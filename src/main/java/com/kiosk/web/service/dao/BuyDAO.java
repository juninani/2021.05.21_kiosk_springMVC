package com.kiosk.web.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kiosk.web.service.buyService;
import com.kiosk.web.service.dto.BuyVO;

public class BuyDAO implements buyService{

	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<BuyVO> getList() {

		List<BuyVO> list = null;

		list = sqlSession.selectList("buy.buy_list");
		return list;
	}

	public int insert(BuyVO buyVo) {

		int res = sqlSession.insert("buy.insert_buy", buyVo);
		return res;

	}

}
