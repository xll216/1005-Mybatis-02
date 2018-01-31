package com.ssm.test;

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
}
