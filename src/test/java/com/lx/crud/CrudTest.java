package com.lx.crud;

import com.lx.crud.bean.Department;
import com.lx.crud.bean.Employee;
import com.lx.crud.mapper.DepartmentMapper;
import com.lx.crud.mapper.EmployeeMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;


/**
 * Created by Administrator on 2018/4/22 0022.
 */
public class CrudTest extends BasicTest{

    @Resource
    private EmployeeMapper employeeMapper;
//    @Autowired
//    private DepartmentMapper departmentMapper;

    @Test
    public void testWithDept(){
        Employee e = employeeMapper.selectByPrimaryKeyWithDept(1);
        System.out.println(e);
//        Department d =departmentMapper.selectByPrimaryKey(1);
//        System.out.println(d);


    }



}
