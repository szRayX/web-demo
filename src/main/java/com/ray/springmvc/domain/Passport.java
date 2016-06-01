package com.ray.springmvc.domain;

import com.ray.base.BaseDomain;

import java.util.Date;

/**
 * Created on 2016/6/1.
 *
 * @author 薛磊
 * @since 1.0.0
 */
public class Passport extends BaseDomain {


    /**
     * 主键
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 管理员或教师所属的学院ID
     */
    private Long schoolId;

    /**
     * 领用日期
     */
    private Date issueTime;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 注销时间
     */
    private Date revokeTime;

    /**
     * 注销类型
     */
    private String revokeType;

    /**
     * 领用IP
     */
    private String issueIp;

    /**
     * 领用设备
     */
    private String issueClient;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Date getIssueTime() {
        return this.issueTime;
    }

    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }

    public Date getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getRevokeTime() {
        return this.revokeTime;
    }

    public void setRevokeTime(Date revokeTime) {
        this.revokeTime = revokeTime;
    }

    public String getRevokeType() {
        return this.revokeType;
    }

    public void setRevokeType(String revokeType) {
        this.revokeType = revokeType;
    }

    public String getIssueIp() {
        return this.issueIp;
    }

    public void setIssueIp(String issueIp) {
        this.issueIp = issueIp;
    }

    public String getIssueClient() {
        return this.issueClient;
    }

    public void setIssueClient(String issueClient) {
        this.issueClient = issueClient;
    }

}
