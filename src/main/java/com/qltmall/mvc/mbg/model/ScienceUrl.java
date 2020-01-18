package com.qltmall.mvc.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ScienceUrl implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "品台名称")
    private String urlName;

    @ApiModelProperty(value = "平台描述")
    private String urlDesc;

    private String keywords;

    @ApiModelProperty(value = "链接内容")
    private String urlContent;

    @ApiModelProperty(value = "微缩图片")
    private String urlThumb;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public String getUrlDesc() {
        return urlDesc;
    }

    public void setUrlDesc(String urlDesc) {
        this.urlDesc = urlDesc;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getUrlContent() {
        return urlContent;
    }

    public void setUrlContent(String urlContent) {
        this.urlContent = urlContent;
    }

    public String getUrlThumb() {
        return urlThumb;
    }

    public void setUrlThumb(String urlThumb) {
        this.urlThumb = urlThumb;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", urlName=").append(urlName);
        sb.append(", urlDesc=").append(urlDesc);
        sb.append(", keywords=").append(keywords);
        sb.append(", urlContent=").append(urlContent);
        sb.append(", urlThumb=").append(urlThumb);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}