package org.fkit.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.fkit.shop.domain.Cart;
import org.fkit.shop.domain.Collect;
import org.fkit.shop.domain.Goods;
import org.fkit.shop.domain.Remark;

public interface GoodsMapper {
	@Select("select * from tb_goods")
	List<Goods> findAll();
	@Select("select * from tb_goods where id=#{id}")
	@Results({ @Result(id = true, column = "id", property = "id"), @Result(column = "image", property = "image"),
			 @Result(column = "catagory", property = "catagory"),
			@Result(column = "goods_name", property = "goods_name"),
			@Result(column = "goods_price", property = "goods_price"),
			@Result(column = "amount", property = "amount"),@Result(column = "remark", property = "remark")})
	List<Goods> selectByGoodsId(int goods_id);
    
	   @Insert("insert into tb_remark(goodsid,remarks,userid,image) values(#{goodsid},#{remarks},#{userid},#{image})")
			@Options(useGeneratedKeys = true, keyProperty = "id")
			int insert(Remark remark);
  @Insert("insert into tb_goods(image,id,goods_name,remark,goods_price,amount) values(#{image},#{id},#{goods_name},#{remark},#{goods_price},#{amount}) ")
  int insertgoods(Goods goods);
  @Delete("delete from tb_goods where id=#{id}")
	int deletegoods(@Param("id")int id);
  @Select("select * from tb_goods where id=#{id}")
  Goods selectGoods(@Param("id")int id);
}
