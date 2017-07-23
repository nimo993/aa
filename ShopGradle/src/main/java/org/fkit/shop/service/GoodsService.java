package org.fkit.shop.service;

import java.util.List;


import org.fkit.shop.domain.Goods;
import org.fkit.shop.domain.Remark;

public interface GoodsService {
	List<Goods> getAll();
	Goods selectGoods(int id);
	int insertgoods(Goods goods);
	int deletegoods(int id);
	int insert(Remark remark);
}
