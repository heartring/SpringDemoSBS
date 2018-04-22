package com.lx.crud;

import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * Created by Administrator on 2018/4/22 0022.
 */
public class EmpTest extends BasicMvcTest{

    @Test
    public void testEmpPage() throws Exception {
        MvcResult result = mockMvc.perform(
                MockMvcRequestBuilders.get("/emps")
                        .param("pn", "1")).andReturn();

        MockHttpServletRequest request =  result.getRequest();

        PageInfo page = (PageInfo)request.getAttribute("pageInfo");

        System.out.println("总页数 : " + page.getPages());

    }


}
