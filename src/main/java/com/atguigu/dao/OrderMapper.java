package com.atguigu.dao;

import com.atguigu.bean.Order;

import java.util.List;

/*************************************************
                时间: 2020-12-26
                作者: 刘  辉
                描述: 
  ************************************************/
public interface OrderMapper {

    public List<Order> getOrderList();
}
