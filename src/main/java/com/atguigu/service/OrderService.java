package com.atguigu.service;

import com.atguigu.bean.Order;
import com.atguigu.dao.OrderMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*************************************************
                时间: 2020-12-26
                作者: 刘  辉
                描述: 
  ************************************************/
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public PageInfo<Order> getOrderList() {
        PageHelper.startPage(2,3);
        List<Order> orderList = orderMapper.getOrderList();
        PageInfo<Order> page = new PageInfo<Order>(orderList);


        return page;
    }

}
