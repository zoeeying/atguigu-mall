package com.zoe.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zoe.common.utils.PageUtils;
import com.zoe.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author zoe
 * @email zoeeying@gmail.com
 * @date 2022-02-09 00:06:22
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

