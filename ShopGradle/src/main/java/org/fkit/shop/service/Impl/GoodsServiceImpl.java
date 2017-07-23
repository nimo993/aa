package org.fkit.shop.service.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.fkit.shop.domain.Cart;
import org.fkit.shop.domain.Goods;
import org.fkit.shop.domain.Remark;
import org.fkit.shop.mapper.GoodsMapper;
import org.fkit.shop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;
	
	@Transactional(readOnly=true)
	@Override
	public List<Goods> getAll() {
		return goodsMapper.findAll();
	}
	@Override
	public int insert(Remark remark) {
		// TODO Auto-generated method stub
		
		
		return 	goodsMapper.insert(remark);
		
	}
	@Override
	public int insertgoods(Goods goods) {
		
	return	goodsMapper.insertgoods(goods);
		
	}
	@Override
	public int deletegoods(int id) {
	
	return	goodsMapper.deletegoods(id);
		
	}
	@Override
	public Goods selectGoods(int id) {
	
	return	goodsMapper.selectGoods(id);
		
	}
}
