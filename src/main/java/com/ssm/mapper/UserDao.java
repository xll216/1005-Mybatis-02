package com.ssm.mapper;

import com.ssm.domain.User;
import com.ssm.domain.UserExt;

import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public interface UserDao {
    List<User> selectOrdersOfUser();

    List<UserExt> selectOrdersOfUser2();

    /*多对多关系*/
    List<User> selectItemOfUser();
}
