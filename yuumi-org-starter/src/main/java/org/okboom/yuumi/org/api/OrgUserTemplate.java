package org.okboom.yuumi.org.api;

import org.okboom.yuumi.org.bean.OrgUser;

import java.util.List;

/**
 * 用户管理接口
 * @author tookbra
 */
public interface OrgUserTemplate {

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
     * @return 获取的部门成员列表
     */
    List<OrgUser> list(Long departId, Boolean fetchChild);
}
