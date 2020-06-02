package cn.sm.com.domain;

import java.math.BigDecimal;

import cn.sm.com.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 预算科目表
 * </p>
 *
 * @author xubo
 * @since 2020-05-23
 */
@TableName("BM_SUBJECT")
public class BmSubject extends BaseEntity<BmSubject> {

    private static final long serialVersionUID=1L;

    /**
     * subject_id
     */
    @TableId("SUBJECT_ID")
    private BigDecimal subjectId;

    /**
     * 科目名称
     */
    @TableField("SUBJECT_NAME")
    private String subjectName;

    /**
     * 科目编码
     */
    @TableField("SUBJECT_CODE")
    private String subjectCode;

    /**
     * 科目全路径名称
     */
    @TableField("FULL_NAME")
    private String fullName;

    /**
     * 父节点id
     */
    @TableField("PARENT_ID")
    private BigDecimal parentId;

    /**
     * 科目类别
     */
    @TableField("SUBJECT_KIND")
    private String subjectKind;

    /**
     * 所属财年
     */
    @TableField("YEAR")
    private Integer year;

    /**
     * 存在子节点
     */
    @TableField("HAS_CHILDREN")
    private String hasChildren;

    /**
     * 是否可用
     */
    @TableField("IS_ENABLE")
    private String isEnable;

    /**
     * 备注
     */
    @TableField("REMARKS")
    private String remarks;

    /**
     * 层级
     */
    @TableField("HIERARCHY")
    private BigDecimal hierarchy;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public BigDecimal getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(BigDecimal subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public BigDecimal getParentId() {
        return parentId;
    }

    public void setParentId(BigDecimal parentId) {
        this.parentId = parentId;
    }

    public String getSubjectKind() {
        return subjectKind;
    }

    public void setSubjectKind(String subjectKind) {
        this.subjectKind = subjectKind;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(String hasChildren) {
        this.hasChildren = hasChildren;
    }

    public String getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public BigDecimal getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(BigDecimal hierarchy) {
        this.hierarchy = hierarchy;
    }

    @Override
    protected Serializable pkVal() {
        return this.subjectId;
    }

    @Override
    public String toString() {
        return "BmSubject{" +
        "subjectId=" + subjectId +
        ", subjectName=" + subjectName +
        ", subjectCode=" + subjectCode +
        ", fullName=" + fullName +
        ", parentId=" + parentId +
        ", subjectKind=" + subjectKind +
        ", year=" + year +
        ", hasChildren=" + hasChildren +
        ", isEnable=" + isEnable +
        ", remarks=" + remarks +
        ", hierarchy=" + hierarchy +
        "}";
    }
}
