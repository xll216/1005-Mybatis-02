package com.ssm.test;

import com.ssm.domain.Clazz;
import com.ssm.mapper.ClazzDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class ClazzTest {

    private ApplicationContext context;
    private ClazzDao clazzDao;

    @Before
    public void init() {
        context = new
                ClassPathXmlApplicationContext(
                "classpath*:spring-*.xml");

        clazzDao = context.getBean(ClazzDao.class);
    }

    @Test
    public void select() {
        Clazz param = new Clazz();
        param.setId(3);
        param.setName("1207");
        param.setInfor("Java");

        /*调用条件查询*/
        List<Clazz> clazzes = clazzDao
                .select(param);
        System.out.println(clazzes);

    }

    @Test
    public void selectInID() {

        List<Integer> param = new ArrayList<>();
        param.add(1);
        param.add(2);
        param.add(5);

        /*批量查询*/
        List<Clazz> clazzes = clazzDao
                .selectInID(param);

        System.out.println(clazzes);

    }
}
