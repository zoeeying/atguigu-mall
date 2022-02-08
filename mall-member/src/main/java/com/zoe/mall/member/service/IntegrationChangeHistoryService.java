package com.zoe.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zoe.common.utils.PageUtils;
import com.zoe.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author zoe
 * @email zoeeying@gmail.com
 * @date 2022-02-08 23:47:24
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

