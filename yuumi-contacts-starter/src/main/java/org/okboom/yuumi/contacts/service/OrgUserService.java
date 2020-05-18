package org.okboom.yuumi.contacts.service;

import org.okboom.yuumi.contacts.bean.OrgUser;

import java.util.List;

/**
 * 用户管理接口
 * @author tookbra
 */
public interface OrgUserService {

    /**
     * 获取部门成员列表
     * @param departId 必填。部门id
     * @param fetchChild 非必填。1/0：是否递归获取子部门下面的成员
     * @return 获取的部门成员列表
     */
    List<OrgUser> listSimple(Long departId, Boolean fetchChild);

    /**
     * 获取部门成员列表(详情)
     * @param departId 必填。部门id
     * @param fetchChild 非必填。1/0：是否递归获取子部门下面的成员
     * @param offset 支持分页查询，与size参数同时设置时才生效，此参数代表偏移量，偏移量从0开始
     * @param size 支持分页查询，与offset参数同时设置时才生效，此参数代表分页大小，最大100
     * @return 获取的部门成员列表
     */
    List<OrgUser> list(Long departId, Boolean fetchChild, Integer offset, Integer size);
}
