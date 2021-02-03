package com.atguigu.bean;
/*************************************************
                时间: 2020-12-26
                作者: 刘  辉
                描述: 
  ************************************************/
public class Order {

    private Integer id;
    private Integer orderType;
    private Integer customerId;
    private double amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderType=" + orderType +
                ", customerId=" + customerId +
                ", amount=" + amount +
                '}';
    }
}
