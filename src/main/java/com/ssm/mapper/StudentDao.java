package com.ssm.mapper;

import com.ssm.domain.Student;

import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public interface StudentDao {

    /*查询所有，返回学生列表集合*/
    List<Student> selectAll();

    /*根据主键id查询学生对象*/
    Student selectById(Integer id);

    /*插入某个学生对象，返回主键id*/
    Integer insertStudent(Student student);

    /*删除某个学生对象，根据主键id；返回删除的个数*/
    Integer deleteById(Integer id);

    /*更新某个学生对象，根据主键id；返回更新的个数*/
    Integer updateById(Student student);

}
