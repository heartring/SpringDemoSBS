package com.lx.crud;

import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2018/4/22 0022.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:config/applicationContext.xml", "classpath:config/spring-web.xml"})
public abstract class BasicTest {

    @After
    public void end(){

    }

}
