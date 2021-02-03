package com.atguigu.service;

import com.atguigu.bean.OrderSetting;
import com.atguigu.dao.OrderSettingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*************************************************
                时间: 2020-12-16
                作者: 刘  辉
                描述: 
  ************************************************/
@Service
public class OrderSettingService {

    @Autowired
    private OrderSettingMapper orderSettingMapper;

    public List<OrderSetting> getOrderSettingList(){
        return orderSettingMapper.getOrderSettingList();
    }
}
