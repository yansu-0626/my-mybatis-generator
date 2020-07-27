package com.unicom.fcp.pubService.mapper;

import com.unicom.fcp.pubService.model.entity.UserActionAuditLog;

public interface UserActionAuditLogMapper {
    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated
     */
    int insert(UserActionAuditLog record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(UserActionAuditLog record);

    /**
     *
     * @mbg.generated
     */
    UserActionAuditLog selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserActionAuditLog record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserActionAuditLog record);
}