package com.zoe.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zoe.common.utils.PageUtils;
import com.zoe.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author zoe
 * @email zoeeying@gmail.com
 * @date 2022-02-08 23:59:41
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

