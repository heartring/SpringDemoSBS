package com.lx.crud;

import com.lx.crud.bean.Department;
import com.lx.crud.bean.Employee;
import com.lx.crud.bean.EmployeeExample;
import com.lx.crud.mapper.DepartmentMapper;
import com.lx.crud.mapper.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;


/**
 * Created by Administrator on 2018/4/22 0022.
 */
public class CrudTest extends BasicTest{

    @Resource
    private EmployeeMapper employeeMapper;
    @Autowired
    private DepartmentMapper departmentMapper;

    @Resource
    private SqlSession sqlSession;

    @Test
    public void testWithDept(){
        Employee e = employeeMapper.selectByPrimaryKeyWithDept(1);
        System.out.println(e);
//        Department d =departmentMapper.selectByPrimaryKey(1);
//        System.out.println(d);


    }

    @Test
    public void insertDepartment(){
//departmentMapper.insertSelective(new Department("品质部"));
//departmentMapper.insertSelective(new Department("销售部"));

//    employeeMapper.insertSelective(new Employee(null, "Jerry","男", "26555@139.com", 3,null));

//        批量插入多个员工,使用可以执行批量操作的sqlSession
        EmployeeMapper employeeMapper =sqlSession.getMapper(EmployeeMapper.class);

//        for(int i = 0;i<1000;i++){
//            employeeMapper.insertSelective(new Employee(null, "Jerry" + (int)(Math.random()*100000),(int)(Math.random()*100)%2==0?"M":"F", "26555"+(int)(Math.random()*100000)+"@139.com", 3,null));
//        }

        EmployeeExample example = new EmployeeExample();
        example.createCriteria().andEmpIdBetween(4,1004);

        employeeMapper.deleteByExample(example);



    }




}
