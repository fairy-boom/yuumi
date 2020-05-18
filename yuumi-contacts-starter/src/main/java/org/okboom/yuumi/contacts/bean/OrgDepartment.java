package org.okboom.yuumi.contacts.bean;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import org.okboom.yuumi.contacts.bean.gson.OrgGsonBuilder;

import java.io.Serializable;

/**
 * 部门
 * @author tookbra
 */
@Data
public class OrgDepartment implements Serializable {
    private static final long serialVersionUID = -6859844817201631180L;

    /**
     * 部门id
     */
    private Long id;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 父部门id。根部门为1
     */
    @SerializedName("parentid")
    private Long parentId;

    public static OrgDepartment fromJson(String json) {
        return OrgGsonBuilder.create().fromJson(json, OrgDepartment.class);
    }
}
