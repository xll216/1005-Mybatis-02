package com.ssm.test;

import com.ssm.domain.OrderDetail;
import com.ssm.domain.Orders;
import com.ssm.domain.User;
import com.ssm.domain.UserExt;
import org.junit.Test;

import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class UserTest extends BaseTest {

    @Test
    public void selectOrdersOfUser() {
//        List<User> userList = userDao
//                .selectOrdersOfUser();
//
//        for (User user : userList) {
//            System.out.println(user);
//            System.out.println(user.getOrderss());
//        }

        List<UserExt> userList = userDao
                .selectOrdersOfUser2();

        for (UserExt user : userList) {
            System.out.println(user);
        }

    }

    @Test
    public void selectItemOfUser() {
        /*查询用户购买的商品列表*/
        List<User> userList = userDao
                .selectItemOfUser();

        for (User user : userList) {
            System.out.println(user);

            /*订单集合*/
            if (user.getOrderss() != null
                    && user.getOrderss().size() > 0) {
                /*遍历订单集合*/
                for (Orders orders : user.getOrderss()) {
                    /*遍历订单明细集合*/
                    for (OrderDetail detail : orders.getOrderDetails()) {
                        /*获得明细对应的商品信息*/
                        System.out.println(detail.getItem());
                    }
                }
            }

            /*分隔符区分用户*/
            System.out.println("************");
        }
    }
}
