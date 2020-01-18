package com.qltmall.mvc.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    @ApiModelProperty(value = "评价的主键")
    private Integer id;

    @ApiModelProperty(value = "对应的用户主键")
    private Integer userId;

    @ApiModelProperty(value = "0表示商品，1表示机构")
    private Boolean comType;

    @ApiModelProperty(value = "机构对应的是org_id,假发产品对应hair_id")
    private Integer idValue;

    @ApiModelProperty(value = "评价的五个等级")
    private Boolean conGrade;

    @ApiModelProperty(value = "评价内容")
    private String conDesc;

    @ApiModelProperty(value = "评论发布时间")
    private Date comTime;

    @ApiModelProperty(value = "评论的图片，用逗号分离")
    private String comImage;

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

    public Boolean getComType() {
        return comType;
    }

    public void setComType(Boolean comType) {
        this.comType = comType;
    }

    public Integer getIdValue() {
        return idValue;
    }

    public void setIdValue(Integer idValue) {
        this.idValue = idValue;
    }

    public Boolean getConGrade() {
        return conGrade;
    }

    public void setConGrade(Boolean conGrade) {
        this.conGrade = conGrade;
    }

    public String getConDesc() {
        return conDesc;
    }

    public void setConDesc(String conDesc) {
        this.conDesc = conDesc;
    }

    public Date getComTime() {
        return comTime;
    }

    public void setComTime(Date comTime) {
        this.comTime = comTime;
    }

    public String getComImage() {
        return comImage;
    }

    public void setComImage(String comImage) {
        this.comImage = comImage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", comType=").append(comType);
        sb.append(", idValue=").append(idValue);
        sb.append(", conGrade=").append(conGrade);
        sb.append(", conDesc=").append(conDesc);
        sb.append(", comTime=").append(comTime);
        sb.append(", comImage=").append(comImage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}