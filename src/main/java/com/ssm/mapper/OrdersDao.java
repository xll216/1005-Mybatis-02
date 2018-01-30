package com.ssm.mapper;

import com.ssm.domain.Orders;

import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public interface OrdersDao {

    /*返回所有订单信息且包含订单所对应的用户信息*/
    List<Orders> selectOrdersAndUser();
}
