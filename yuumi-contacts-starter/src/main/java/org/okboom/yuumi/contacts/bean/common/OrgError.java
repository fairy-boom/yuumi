package org.okboom.yuumi.contacts.bean.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import org.okboom.yuumi.contacts.bean.gson.OrgGsonBuilder;

import java.io.Serializable;

/**
 * @author tookbra
 */
@Data
public class OrgError implements Serializable {
    private static final long serialVersionUID = 4432013970211273751L;

    /**
     * 错误代码.
     */
    @SerializedName("errcode")
    private int errorCode;

    /**
     * 错误信息.
     */
    @SerializedName("errmsg")
    private String errorMsg;

    public static OrgError fromJson(String json) {
        final OrgError orgError = OrgGsonBuilder.create().fromJson(json, OrgError.class);
        return orgError;
    }
}
