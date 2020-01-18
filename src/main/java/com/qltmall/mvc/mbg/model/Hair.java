package com.qltmall.mvc.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class Hair implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "商品名称")
    private String hairName;

    @ApiModelProperty(value = "销售量")
    private Integer hairSold;

    @ApiModelProperty(value = "库存量")
    private Short hairGoods;

    @ApiModelProperty(value = "价格")
    private BigDecimal hairPiece;

    @ApiModelProperty(value = "详细描述")
    private String hairDesc;

    @ApiModelProperty(value = "关键字——检索使用")
    private String keyWords;

    @ApiModelProperty(value = "对应店铺主键")
    private Integer shopId;

    @ApiModelProperty(value = "用于列表展示的微缩图片")
    private String hairThumb;

    @ApiModelProperty(value = "发型相册，用逗号分隔")
    private String hairPhoto;

    @ApiModelProperty(value = "对应3d发型展示的主键")
    private Integer threeHairId;

    @ApiModelProperty(value = "品牌名称")
    private String hairBrand;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHairName() {
        return hairName;
    }

    public void setHairName(String hairName) {
        this.hairName = hairName;
    }

    public Integer getHairSold() {
        return hairSold;
    }

    public void setHairSold(Integer hairSold) {
        this.hairSold = hairSold;
    }

    public Short getHairGoods() {
        return hairGoods;
    }

    public void setHairGoods(Short hairGoods) {
        this.hairGoods = hairGoods;
    }

    public BigDecimal getHairPiece() {
        return hairPiece;
    }

    public void setHairPiece(BigDecimal hairPiece) {
        this.hairPiece = hairPiece;
    }

    public String getHairDesc() {
        return hairDesc;
    }

    public void setHairDesc(String hairDesc) {
        this.hairDesc = hairDesc;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getHairThumb() {
        return hairThumb;
    }

    public void setHairThumb(String hairThumb) {
        this.hairThumb = hairThumb;
    }

    public String getHairPhoto() {
        return hairPhoto;
    }

    public void setHairPhoto(String hairPhoto) {
        this.hairPhoto = hairPhoto;
    }

    public Integer getThreeHairId() {
        return threeHairId;
    }

    public void setThreeHairId(Integer threeHairId) {
        this.threeHairId = threeHairId;
    }

    public String getHairBrand() {
        return hairBrand;
    }

    public void setHairBrand(String hairBrand) {
        this.hairBrand = hairBrand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hairName=").append(hairName);
        sb.append(", hairSold=").append(hairSold);
        sb.append(", hairGoods=").append(hairGoods);
        sb.append(", hairPiece=").append(hairPiece);
        sb.append(", hairDesc=").append(hairDesc);
        sb.append(", keyWords=").append(keyWords);
        sb.append(", shopId=").append(shopId);
        sb.append(", hairThumb=").append(hairThumb);
        sb.append(", hairPhoto=").append(hairPhoto);
        sb.append(", threeHairId=").append(threeHairId);
        sb.append(", hairBrand=").append(hairBrand);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}