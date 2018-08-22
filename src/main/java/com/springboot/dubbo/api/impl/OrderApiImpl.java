/**
 * Copyright (C), 2015-2017, tsfa
 * FileName: OrderApiImpl.java
 * Author:   chin
 * Date:     2018/8/22    上午11:22
 * Description:
 * History: 修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名     修改时间      版本号        描述
 */
package com.springboot.dubbo.api.impl;

import com.springboot.dubbo.api.OrderApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 订单服务实现类<br>
 * 〈功能详细描述〉
 *
 * @author Chin
 * @since 1.0
 */
@Service("orderApi")
@com.alibaba.dubbo.config.annotation.Service
public class OrderApiImpl implements OrderApi {
    public static final Logger LOGGER = LoggerFactory.getLogger(OrderApiImpl.class);

    @Override
    public String queryOrderStatus(String orderNo) {
        LOGGER.info("查询订单号:[{}]", orderNo);

        return "SUCCESS";
    }
}
