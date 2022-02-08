package com.zoe.mall.order.dao;

import com.zoe.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zoe
 * @email zoeeying@gmail.com
 * @date 2022-02-08 23:59:41
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
