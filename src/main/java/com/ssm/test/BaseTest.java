package com.ssm.test;

import com.ssm.mapper.ItemDao;
import com.ssm.mapper.OrderDetailDao;
import com.ssm.mapper.OrdersDao;
import com.ssm.mapper.UserDao;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class BaseTest {

    private ApplicationContext context;

    /*dao层对象变成子类能够访问的保护类型*/
    protected UserDao userDao;
    protected ItemDao itemDao;
    protected OrdersDao ordersDao;
    protected OrderDetailDao orderDetailDao;

    @Before
    public void init() {
        context = new
                ClassPathXmlApplicationContext(
                "classpath*:spring-*.xml");

        userDao = context.getBean(UserDao.class);
        itemDao = context.getBean(ItemDao.class);
        ordersDao = context.getBean(OrdersDao.class);
        orderDetailDao = context.getBean(OrderDetailDao.class);
    }
}
