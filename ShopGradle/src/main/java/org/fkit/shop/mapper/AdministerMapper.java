package org.fkit.shop.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.shop.domain.Administer;

public interface AdministerMapper {
	@Select("select * from tb_administer where loginname = #{loginname} and password = #{password}")
	Administer findWithLoginnameAndPassword(@Param("loginname")String loginname,
			@Param("password") String password);
	@Update("update tb_order set state=#{state}   where  goods_id=#{goods_id}")
	void begin(@Param("state") String state,@Param("goods_id") int goods_id);
	
	
}
