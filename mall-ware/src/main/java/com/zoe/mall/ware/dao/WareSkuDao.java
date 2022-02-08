package com.zoe.mall.ware.dao;

import com.zoe.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zoe
 * @email zoeeying@gmail.com
 * @date 2022-02-09 00:06:22
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
