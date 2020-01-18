package com.qltmall.mvc.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ThreeHair implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "检索使用的关键字")
    private String keywords;

    @ApiModelProperty(value = "展示列表微缩图片")
    private String threeHairThumb;

    @ApiModelProperty(value = "存放3d文件的url")
    private String threeHairUrl;

    @ApiModelProperty(value = "3d发型名称")
    private String threeHairName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getThreeHairThumb() {
        return threeHairThumb;
    }

    public void setThreeHairThumb(String threeHairThumb) {
        this.threeHairThumb = threeHairThumb;
    }

    public String getThreeHairUrl() {
        return threeHairUrl;
    }

    public void setThreeHairUrl(String threeHairUrl) {
        this.threeHairUrl = threeHairUrl;
    }

    public String getThreeHairName() {
        return threeHairName;
    }

    public void setThreeHairName(String threeHairName) {
        this.threeHairName = threeHairName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", keywords=").append(keywords);
        sb.append(", threeHairThumb=").append(threeHairThumb);
        sb.append(", threeHairUrl=").append(threeHairUrl);
        sb.append(", threeHairName=").append(threeHairName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}