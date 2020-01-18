package com.qltmall.mvc.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Collect implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "产品的hair_id,机构的org_id")
    private Integer idValue;

    @ApiModelProperty(value = "对应的用户id")
    private Integer userId;

    @ApiModelProperty(value = "收藏时间")
    private Date addTime;

    @ApiModelProperty(value = "0表示取消收藏")
    private Boolean isAttention;

    @ApiModelProperty(value = "收藏的类型，0表示商品，1表示机构")
    private Boolean colType;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdValue() {
        return idValue;
    }

    public void setIdValue(Integer idValue) {
        this.idValue = idValue;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Boolean getIsAttention() {
        return isAttention;
    }

    public void setIsAttention(Boolean isAttention) {
        this.isAttention = isAttention;
    }

    public Boolean getColType() {
        return colType;
    }

    public void setColType(Boolean colType) {
        this.colType = colType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", idValue=").append(idValue);
        sb.append(", userId=").append(userId);
        sb.append(", addTime=").append(addTime);
        sb.append(", isAttention=").append(isAttention);
        sb.append(", colType=").append(colType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}