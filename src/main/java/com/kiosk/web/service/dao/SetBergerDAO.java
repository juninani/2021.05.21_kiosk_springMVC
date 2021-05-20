package com.kiosk.web.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kiosk.web.service.SetBergerService;
import com.kiosk.web.service.dto.SetBergerVO;

public class SetBergerDAO implements SetBergerService{
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	public List<SetBergerVO> getList() {
		
		List<SetBergerVO> list = null;

		list = sqlSession.selectList("sBerger.sBerger_list");
		return list;
		
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(SetBergerVO setBergerVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(SetBergerVO setBergerVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int idx) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

	
}
