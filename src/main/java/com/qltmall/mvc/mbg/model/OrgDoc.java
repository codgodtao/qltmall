package com.qltmall.mvc.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class OrgDoc implements Serializable {
    @ApiModelProperty(value = "医生递增主键")
    private Integer id;

    @ApiModelProperty(value = "医生姓名")
    private String docName;

    @ApiModelProperty(value = "医生图片")
    private String docImage;

    @ApiModelProperty(value = "教育程度")
    private String docEdu;

    @ApiModelProperty(value = "详细描述")
    private String docDesc;

    private Integer orgId;

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

    public String getDocImage() {
        return docImage;
    }

    public void setDocImage(String docImage) {
        this.docImage = docImage;
    }

    public String getDocEdu() {
        return docEdu;
    }

    public void setDocEdu(String docEdu) {
        this.docEdu = docEdu;
    }

    public String getDocDesc() {
        return docDesc;
    }

    public void setDocDesc(String docDesc) {
        this.docDesc = docDesc;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", docName=").append(docName);
        sb.append(", docImage=").append(docImage);
        sb.append(", docEdu=").append(docEdu);
        sb.append(", docDesc=").append(docDesc);
        sb.append(", orgId=").append(orgId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}