package org.okboom.yuumi.contacts.bean;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import org.okboom.yuumi.contacts.bean.gson.OrgGsonBuilder;

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
    @SerializedName("userid")
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

    public static OrgUser fromJson(String json) {
        return OrgGsonBuilder.create().fromJson(json, OrgUser.class);
    }
}
