package com.kiosk.web.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kiosk.web.service.BergerService;
import com.kiosk.web.service.dto.BergerVO;

public class BergerDAO implements BergerService {
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<BergerVO> getList() {

		List<BergerVO> list = null;

		list = sqlSession.selectList("berger.berger_list");
		return list;
	}

	public int getCount() {

		return 0;
	}

	public int insert(BergerVO bergerVo) {

		return 0;
	}

	public int update(BergerVO bergerVo) {

		return 0;
	}

	public int delete(int idx) {

		int res = sqlSession.delete("berger.berger_del", idx);

		return res;
	}
	
	

}
