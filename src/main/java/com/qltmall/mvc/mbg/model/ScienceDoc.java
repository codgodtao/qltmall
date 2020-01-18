package com.qltmall.mvc.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ScienceDoc implements Serializable {
    @ApiModelProperty(value = "文档递增主键")
    private Integer id;

    @ApiModelProperty(value = "标题")
    private String docName;

    @ApiModelProperty(value = "检索的关键字")
    private String keywords;

    @ApiModelProperty(value = "正文")
    private String docContent;

    @ApiModelProperty(value = "作者")
    private String docAuthor;

    @ApiModelProperty(value = "创建时间")
    private Date docTime;

    @ApiModelProperty(value = "列表展示微缩图片")
    private String docThumb;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDocContent() {
        return docContent;
    }

    public void setDocContent(String docContent) {
        this.docContent = docContent;
    }

    public String getDocAuthor() {
        return docAuthor;
    }

    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    public Date getDocTime() {
        return docTime;
    }

    public void setDocTime(Date docTime) {
        this.docTime = docTime;
    }

    public String getDocThumb() {
        return docThumb;
    }

    public void setDocThumb(String docThumb) {
        this.docThumb = docThumb;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", docName=").append(docName);
        sb.append(", keywords=").append(keywords);
        sb.append(", docContent=").append(docContent);
        sb.append(", docAuthor=").append(docAuthor);
        sb.append(", docTime=").append(docTime);
        sb.append(", docThumb=").append(docThumb);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}