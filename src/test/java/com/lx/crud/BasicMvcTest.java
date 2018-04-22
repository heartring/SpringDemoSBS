package com.lx.crud;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/4/22 0022.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration //此注解可将自己作为web组件 注入到环境中
@ContextConfiguration(value = {"classpath:config/applicationContext.xml","classpath:config/spring-web.xml"})
public abstract class BasicMvcTest {

//    传入spring mvc 的ioc
    @Resource
    protected WebApplicationContext context;
//  虚拟mvc 请求,获取到请求的结果
    protected MockMvc mockMvc;

    @Before
    public void initMockMvc(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

}
