package com.ssm.mapper;

import com.ssm.domain.Clazz;

import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public interface ClazzDao {

    /*条件查询*/
    List<Clazz> select(Clazz clazz);

    /*批量主键id查询*/
    List<Clazz> selectInID(List<Integer> ids);
}
