package com.lx.crud.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lx.crud.bean.Employee;
import com.lx.crud.service.itf.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/4/22 0022.
 */
@Controller
public class EmpController {

    @Resource
    private EmpService empService;

    @RequestMapping(value = "/emps")
    public String getEmps(@RequestParam(value = "pn", defaultValue = "1") Integer pn
            , Model model){

//        引入pageHelper 分页插件
//        调用PageHelper 方法,实现分页查询
        PageHelper.startPage(pn, 5);
//        startPage 后面紧跟的查询就是一个分页查询
        List<Employee> emps = empService.getAll();
//      使用 pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了,
//        pageInfo封装了详细的分页信息,包括有我们查询出来的数据,  传入需要连续显示的页码数
        PageInfo pageInfo = new PageInfo(emps, 5);
//      使用model给jsp页面传值
        model.addAttribute("pageInfo", pageInfo);

        return "list";
    }


}
