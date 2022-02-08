package com.zoe.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zoe.common.utils.PageUtils;
import com.zoe.mall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author zoe
 * @email zoeeying@gmail.com
 * @date 2022-02-09 00:06:22
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

