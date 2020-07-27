package com.unicom.fcp.pubService.model.entity;

import java.util.Date;

public class UserActionAuditLog {
    /**
     * 主键 ID
     */
    private String id;

    /**
     * 操作提交用户登录名 OPERATION_SUBMIT_USER_LOGIN_NAME
     */
    private String operationSubmitUserLoginName;

    /**
     * 操作描述-为服务path对应服务名称 OPERATION_DESC
     */
    private String operationDesc;

    /**
     * 具体操作（入参，非必填） CONCRETE_OPERATION
     */
    private String concreteOperation;

    /**
     * 复核用户登录名 REVIEW_USER_LOGIN_NAME
     */
    private String reviewUserLoginName;

    /**
     * 复核时间 REVIEW_TIME
     */
    private Date reviewTime;

    /**
     * 状态-备用默认0 STATE
     */
    private Integer state;

    /**
     * 创建时间 CREATE_TIME
     */
    private Date createTime;

    /**
     * 备注 REMARKS
     */
    private String remarks;

    /**
     *
     * @mbg.generated
     */
    public UserActionAuditLog(String id, String operationSubmitUserLoginName, String operationDesc, String concreteOperation, String reviewUserLoginName, Date reviewTime, Integer state, Date createTime, String remarks) {
        this.id = id;
        this.operationSubmitUserLoginName = operationSubmitUserLoginName;
        this.operationDesc = operationDesc;
        this.concreteOperation = concreteOperation;
        this.reviewUserLoginName = reviewUserLoginName;
        this.reviewTime = reviewTime;
        this.state = state;
        this.createTime = createTime;
        this.remarks = remarks;
    }

    /**
     *
     * @mbg.generated
     */
    public UserActionAuditLog() {
        super();
    }

    /**
     * get主键
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @return ID 主键
     */
    public String getId() {
        return id;
    }

    /**
     * set主键
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * get操作提交用户登录名
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @return OPERATION_SUBMIT_USER_LOGIN_NAME 操作提交用户登录名
     */
    public String getOperationSubmitUserLoginName() {
        return operationSubmitUserLoginName;
    }

    /**
     * set操作提交用户登录名
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @param operationSubmitUserLoginName 操作提交用户登录名
     */
    public void setOperationSubmitUserLoginName(String operationSubmitUserLoginName) {
        this.operationSubmitUserLoginName = operationSubmitUserLoginName == null ? null : operationSubmitUserLoginName.trim();
    }

    /**
     * get操作描述-为服务path对应服务名称
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @return OPERATION_DESC 操作描述-为服务path对应服务名称
     */
    public String getOperationDesc() {
        return operationDesc;
    }

    /**
     * set操作描述-为服务path对应服务名称
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @param operationDesc 操作描述-为服务path对应服务名称
     */
    public void setOperationDesc(String operationDesc) {
        this.operationDesc = operationDesc == null ? null : operationDesc.trim();
    }

    /**
     * get具体操作（入参，非必填）
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @return CONCRETE_OPERATION 具体操作（入参，非必填）
     */
    public String getConcreteOperation() {
        return concreteOperation;
    }

    /**
     * set具体操作（入参，非必填）
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @param concreteOperation 具体操作（入参，非必填）
     */
    public void setConcreteOperation(String concreteOperation) {
        this.concreteOperation = concreteOperation == null ? null : concreteOperation.trim();
    }

    /**
     * get复核用户登录名
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @return REVIEW_USER_LOGIN_NAME 复核用户登录名
     */
    public String getReviewUserLoginName() {
        return reviewUserLoginName;
    }

    /**
     * set复核用户登录名
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @param reviewUserLoginName 复核用户登录名
     */
    public void setReviewUserLoginName(String reviewUserLoginName) {
        this.reviewUserLoginName = reviewUserLoginName == null ? null : reviewUserLoginName.trim();
    }

    /**
     * get复核时间
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @return REVIEW_TIME 复核时间
     */
    public Date getReviewTime() {
        return reviewTime;
    }

    /**
     * set复核时间
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @param reviewTime 复核时间
     */
    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    /**
     * get状态-备用默认0
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @return STATE 状态-备用默认0
     */
    public Integer getState() {
        return state;
    }

    /**
     * set状态-备用默认0
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @param state 状态-备用默认0
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * get创建时间
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @return CREATE_TIME 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * set创建时间
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * get备注
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @return REMARKS 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * set备注
     * @author yansu
     * @date 2020-05-08 17:55:26
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}