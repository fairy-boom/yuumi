package org.okboom.yuumi.org.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户
 * @author tookbra
 */
@Data
public class OrgUser implements Serializable {

    private static final long serialVersionUID = 7069893655142344671L;

    /**
     * 用户id
     */
    private String userId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 部门id列表
     */
    private Long[] department;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 状态
     */
    private Integer statue;
}
