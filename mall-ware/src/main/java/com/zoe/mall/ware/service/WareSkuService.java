package com.zoe.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zoe.common.utils.PageUtils;
import com.zoe.mall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author zoe
 * @email zoeeying@gmail.com
 * @date 2022-02-09 00:06:22
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

