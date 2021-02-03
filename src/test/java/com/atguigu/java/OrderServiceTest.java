package com.atguigu.java;

import com.atguigu.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*************************************************
                时间: 2020-12-26
                作者: 刘  辉
                描述: 
  ************************************************/
public class OrderServiceTest {

    /************************************************************
                    分页插件PageHelper的使用
     第一步：导入PageHelper的依赖
     第二步：在mybatis的全局配置文件中配置PageHelper
     第三步：在service层使用pagehelper进行分页
            1.在查询列表之前通过调用PageHelper.startPage(pageNum,pageSize);
            2.在查询列表之后，用PageInfo的构造器封装查询的列表
            3.返回pageInfo对象
    ************************************************************/
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderService bean = context.getBean(OrderService.class);


    }
}
