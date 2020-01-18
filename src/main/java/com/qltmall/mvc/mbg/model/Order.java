package com.qltmall.mvc.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "收货地址id")
    private Integer userAddressId;

    @ApiModelProperty(value = "产品id")
    private Integer hairId;

    @ApiModelProperty(value = "数量")
    private Short orderNumber;

    @ApiModelProperty(value = "总价格")
    private BigDecimal orderAccount;

    @ApiModelProperty(value = "日期")
    private Date orderDate;

    @ApiModelProperty(value = "订单编号")
    private String orderSn;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(Integer userAddressId) {
        this.userAddressId = userAddressId;
    }

    public Integer getHairId() {
        return hairId;
    }

    public void setHairId(Integer hairId) {
        this.hairId = hairId;
    }

    public Short getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Short orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getOrderAccount() {
        return orderAccount;
    }

    public void setOrderAccount(BigDecimal orderAccount) {
        this.orderAccount = orderAccount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userAddressId=").append(userAddressId);
        sb.append(", hairId=").append(hairId);
        sb.append(", orderNumber=").append(orderNumber);
        sb.append(", orderAccount=").append(orderAccount);
        sb.append(", orderDate=").append(orderDate);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}