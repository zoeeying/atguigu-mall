package com.zoe.mall.product.dao;

import com.zoe.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zoe
 * @email zoeeying@gmail.com
 * @date 2022-02-05 16:07:16
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
