package com.ssm.test;

import com.ssm.domain.Student;
import com.ssm.mapper.StudentDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class StudentTest {

    private ApplicationContext context;
    private StudentDao studentDao;

    @Before
    public void init() {
        context = new
                ClassPathXmlApplicationContext(
                "classpath*:spring-*.xml");

        studentDao = context.getBean(StudentDao.class);
    }

    @Test
    public void testSelectAll() {

        List<Student> students = studentDao
                .selectAll();

        System.out.println(students);
    }

    @Test
    public void selectById() {
        Student student = studentDao
                .selectById(1);
        System.out.println(student);
    }

    @Test
    public void insertStudent() {
        Student student = new Student(
                "张三", "123");
        int key = studentDao
                .insertStudent(student);
        System.out.println(key);
        System.out.println("生成的主键id：" + student.getId());

    }


    @Test
    public void deleteById() {
        int count = studentDao
                .deleteById(19);
        System.out.println(count);
    }

    @Test
    public void updateById() {

        Student student = studentDao
                .selectById(1);

        student.setName("王铭new");
        student.setPassword("1111");

        int count = studentDao.updateById(student);

        System.out.println(count);
    }

}
