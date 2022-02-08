package com.zoe.mall.coupon.dao;

import com.zoe.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zoe
 * @email zoeeying@gmail.com
 * @date 2022-02-08 23:32:48
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
