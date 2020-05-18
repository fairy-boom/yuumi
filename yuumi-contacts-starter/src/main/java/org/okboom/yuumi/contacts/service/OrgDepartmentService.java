package org.okboom.yuumi.contacts.service;

import org.okboom.yuumi.contacts.bean.OrgDepartment;

import java.util.List;

/**
 * 部门管理接口
 * @author tookbra
 */
public interface OrgDepartmentService {

    /**
     * 获取部门列表
     * @param id 部门id。获取指定部门及其下的子部门。非必需，可为null
     * @return 获取的部门列表
     */
    List<OrgDepartment> list(Long id);
}
