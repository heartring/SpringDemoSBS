package com.lx.crud.service.impl;

import com.lx.crud.bean.Employee;
import com.lx.crud.mapper.EmployeeMapper;
import com.lx.crud.service.itf.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/4/22 0022.
 */

@Service
public class EmpServiceImpl implements EmpService{

    @Resource
    private EmployeeMapper employeeMapper;


    @Override
    public List<Employee> getAll() {

        List<Employee> emps= employeeMapper.selectByExampleWithDept(null);

        return emps;
    }
}
