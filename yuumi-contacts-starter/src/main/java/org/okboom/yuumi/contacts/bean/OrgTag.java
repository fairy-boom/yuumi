package org.okboom.yuumi.contacts.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 角色
 * @author tookbra
 */
@Data
public class OrgTag implements Serializable {
    private static final long serialVersionUID = -2411146360860331259L;


    /**
     * 角色组名称
     */
    private String name;
    /**
     * 角色组id
     */
    private String groupId;


    @Data
    class OrgRole implements Serializable {
        private static final long serialVersionUID = 3227965153877920439L;

        /**
         * 角色ID
         */
        private String id;
        /**
         * 角色名称
         */
        private String name;
    }

}
