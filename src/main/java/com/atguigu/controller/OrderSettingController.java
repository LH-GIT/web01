package com.atguigu.controller;

import com.atguigu.bean.OrderSetting;
import com.atguigu.service.OrderSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*************************************************
                时间: 2020-12-16
                作者: 刘  辉
                描述: 
  ************************************************/
@Controller
@RequestMapping("/order")
public class OrderSettingController {

    @Autowired
    private OrderSettingService orderSettingService;

    @ResponseBody
    @RequestMapping("/list")
    public List<OrderSetting> getOrderSettingList(){
       return orderSettingService.getOrderSettingList();
    }
}
