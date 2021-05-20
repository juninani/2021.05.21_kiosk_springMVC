package com.kiosk.web.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kiosk.web.service.SideMenuService;
import com.kiosk.web.service.dto.SideMenuVO;

public class SideMenuDAO implements SideMenuService{
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<SideMenuVO> getList() {
		
		List<SideMenuVO> list = null;

		list = sqlSession.selectList("sideMenu.sideMenu_list");
		return list;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(SideMenuVO sideMenuVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(SideMenuVO sideMenuVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int idx) {
		// TODO Auto-generated method stub
		return 0;
	}


	

}
