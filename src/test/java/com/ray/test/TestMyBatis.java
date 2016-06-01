package com.ray.test;

import com.alibaba.fastjson.JSON;
import com.ray.springmvc.biz.CollegeAdmissionManager;
import com.ray.springmvc.po.CollegeAdmissionPO;
import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Authentication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.annotation.Resource;

/**
 * Created on 2016/6/1.
 *
 * @author 薛磊
 * @since 1.0.0
 */

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:config/spring-mybatis.xml"})
@TransactionConfiguration(defaultRollback = false)
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    //  private ApplicationContext ac = null;
    @Resource
    private CollegeAdmissionManager collegeAdmissionManager;

//  @Before
//  public void before() {
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//      userService = (IUserService) ac.getBean("userService");
//  }

    @Test
    public void test1() {
        CollegeAdmissionPO user = collegeAdmissionManager.get(737156570831523840L);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }
}
