package com.qltmall.mvc.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Org implements Serializable {
    @ApiModelProperty(value = "机构号，递增主键")
    private Integer id;

    @ApiModelProperty(value = "开设时间")
    private Date orgStart;

    @ApiModelProperty(value = "机构名称")
    private String orgName;

    @ApiModelProperty(value = "机构详细地址")
    private String orgAddress;

    @ApiModelProperty(value = "所在省份")
    private String orgProvince;

    @ApiModelProperty(value = "所在城市")
    private String orgCity;

    @ApiModelProperty(value = "列表展示的微缩图片")
    private String orgThumb;

    @ApiModelProperty(value = "机构相册，逗号隔离")
    private String orgPhoto;

    @ApiModelProperty(value = "四种类型的机构")
    private Boolean orgType;

    @ApiModelProperty(value = "机构联系电话")
    private String orgTel;

    @ApiModelProperty(value = "机构详细描述")
    private String orgDesc;

    @ApiModelProperty(value = "价格服务对应一览表")
    private String orgPrice;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrgStart() {
        return orgStart;
    }

    public void setOrgStart(Date orgStart) {
        this.orgStart = orgStart;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    public String getOrgProvince() {
        return orgProvince;
    }

    public void setOrgProvince(String orgProvince) {
        this.orgProvince = orgProvince;
    }

    public String getOrgCity() {
        return orgCity;
    }

    public void setOrgCity(String orgCity) {
        this.orgCity = orgCity;
    }

    public String getOrgThumb() {
        return orgThumb;
    }

    public void setOrgThumb(String orgThumb) {
        this.orgThumb = orgThumb;
    }

    public String getOrgPhoto() {
        return orgPhoto;
    }

    public void setOrgPhoto(String orgPhoto) {
        this.orgPhoto = orgPhoto;
    }

    public Boolean getOrgType() {
        return orgType;
    }

    public void setOrgType(Boolean orgType) {
        this.orgType = orgType;
    }

    public String getOrgTel() {
        return orgTel;
    }

    public void setOrgTel(String orgTel) {
        this.orgTel = orgTel;
    }

    public String getOrgDesc() {
        return orgDesc;
    }

    public void setOrgDesc(String orgDesc) {
        this.orgDesc = orgDesc;
    }

    public String getOrgPrice() {
        return orgPrice;
    }

    public void setOrgPrice(String orgPrice) {
        this.orgPrice = orgPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orgStart=").append(orgStart);
        sb.append(", orgName=").append(orgName);
        sb.append(", orgAddress=").append(orgAddress);
        sb.append(", orgProvince=").append(orgProvince);
        sb.append(", orgCity=").append(orgCity);
        sb.append(", orgThumb=").append(orgThumb);
        sb.append(", orgPhoto=").append(orgPhoto);
        sb.append(", orgType=").append(orgType);
        sb.append(", orgTel=").append(orgTel);
        sb.append(", orgDesc=").append(orgDesc);
        sb.append(", orgPrice=").append(orgPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}