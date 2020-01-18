package com.qltmall.mvc.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ScienceVideo implements Serializable {
    @ApiModelProperty(value = "视频递增主键")
    private Integer id;

    @ApiModelProperty(value = "名称")
    private String vidName;

    @ApiModelProperty(value = "视频内容url")
    private String vidContent;

    @ApiModelProperty(value = "作者信息")
    private String vidAuthor;

    @ApiModelProperty(value = "上线时间")
    private Date vidTime;

    @ApiModelProperty(value = "视频列表展示微缩图片")
    private String videoThumb;

    @ApiModelProperty(value = "关键字检索")
    private String keywords;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVidName() {
        return vidName;
    }

    public void setVidName(String vidName) {
        this.vidName = vidName;
    }

    public String getVidContent() {
        return vidContent;
    }

    public void setVidContent(String vidContent) {
        this.vidContent = vidContent;
    }

    public String getVidAuthor() {
        return vidAuthor;
    }

    public void setVidAuthor(String vidAuthor) {
        this.vidAuthor = vidAuthor;
    }

    public Date getVidTime() {
        return vidTime;
    }

    public void setVidTime(Date vidTime) {
        this.vidTime = vidTime;
    }

    public String getVideoThumb() {
        return videoThumb;
    }

    public void setVideoThumb(String videoThumb) {
        this.videoThumb = videoThumb;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", vidName=").append(vidName);
        sb.append(", vidContent=").append(vidContent);
        sb.append(", vidAuthor=").append(vidAuthor);
        sb.append(", vidTime=").append(vidTime);
        sb.append(", videoThumb=").append(videoThumb);
        sb.append(", keywords=").append(keywords);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}