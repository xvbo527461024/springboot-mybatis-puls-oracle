package cn.sm.com.domain;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 费用预算部门
 * </p>
 *
 * @author xubo
 * @since 2020-05-23
 */
@TableName("BM_ENTITY")
public class BmEntity extends Model<BmEntity> {

    private static final long serialVersionUID=1L;

    /**
     * 预算实体ID
     */
    @TableId("ENTITY_ID")
    private Long entityId;

    /**
     * 预算实体名称
     */
    @TableField("ENTITY_NAME")
    private String entityName;

    /**
     * 所属预算组织id
     */
    @TableField("ORGANIZATION_ID")
    private BigDecimal organizationId;

    /**
     * 所属财年
     */
    @TableField("YEAR")
    private Integer year;

    /**
     * 负责人
     */
    @TableField("MANAGER_NAME")
    private String managerName;

    /**
     * 负责人id
     */
    @TableField("MANAGER_ID")
    private String managerId;

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
     * 是否项目
     */
    @TableField("IS_PROJECT")
    private String isProject;

    /**
     * 项目id
     */
    @TableField("PROJECT_ID")
    private String projectId;

    /**
     * 项目名称
     */
    @TableField("PROJECT_NAME")
    private String projectName;

    /**
     * 中心/部门id
     */
    @TableField("ORG_ID")
    private String orgId;

    /**
     * 中心/部门名称
     */
    @TableField("ORG_NAME")
    private String orgName;


    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public BigDecimal getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(BigDecimal organizationId) {
        this.organizationId = organizationId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
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

    public String getIsProject() {
        return isProject;
    }

    public void setIsProject(String isProject) {
        this.isProject = isProject;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    protected Serializable pkVal() {
        return this.entityId;
    }

    @Override
    public String toString() {
        return "BmEntity{" +
        "entityId=" + entityId +
        ", entityName=" + entityName +
        ", organizationId=" + organizationId +
        ", year=" + year +
        ", managerName=" + managerName +
        ", managerId=" + managerId +
        ", isEnable=" + isEnable +
        ", remarks=" + remarks +
        ", isProject=" + isProject +
        ", projectId=" + projectId +
        ", projectName=" + projectName +
        ", orgId=" + orgId +
        ", orgName=" + orgName +
        "}";
    }
}
