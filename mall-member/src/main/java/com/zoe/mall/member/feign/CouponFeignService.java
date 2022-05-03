package com.zoe.mall.member.feign;

import com.zoe.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 声明式的远程调用，告诉SpringCloud，这是一个远程客户端
 * 调用memberCoupons方法，会去注册中心中找到远程服务mall-coupon
 * 再去调用/coupon/coupon/member/list接口
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
