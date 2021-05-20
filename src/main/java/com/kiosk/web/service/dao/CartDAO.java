package com.kiosk.web.service.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kiosk.web.service.cartService;
import com.kiosk.web.service.dto.CartVO;

public class CartDAO implements cartService {

	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<CartVO> getList() {

		List<CartVO> list = null;

		list = sqlSession.selectList("cart.cart_list");
		return list;
	}

	public int insert(CartVO cartVo) {

		int res = sqlSession.insert("cart.insert_cart", cartVo);
		return res;

	}

	public int delete(int idx) {

		int res = sqlSession.delete("cart.cart_del", idx);

		return res;
	}

	// 이미 장바구니에 등록된 상품이 있는지 확인함
	public CartVO selectOne(CartVO vo) {

		CartVO resVO = null;
		resVO = sqlSession.selectOne("cart.cart_one", vo);

		return resVO;
	}

	public void allDelete() {

		sqlSession.delete("cart.cart_del_all");

	}

	public int getPrice() {

		int price = 0;
		price = sqlSession.selectOne("cart.cart_price");

		return price;
	}

	public int update_cnt(int idx, int cnt) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("idx", idx);
		map.put("cnt", cnt);

		int res = sqlSession.update("cart.update_cart", map);

		return res;
	}

}
