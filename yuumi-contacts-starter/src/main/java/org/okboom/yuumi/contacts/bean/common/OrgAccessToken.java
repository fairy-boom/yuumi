package org.okboom.yuumi.contacts.bean.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import org.okboom.yuumi.contacts.bean.gson.OrgGsonBuilder;

import java.io.Serializable;

/**
 * @author tookbra
 */
@Data
public class OrgAccessToken implements Serializable {
    private static final long serialVersionUID = 5394453416662076472L;

    /**
     * 凭证
     */
    @SerializedName("access_token")
    private String accessToken;

    /**
     * 凭证的有效时间（秒）
     */
    @SerializedName("expires_in")
    private int expiresIn = -1;

    public static OrgAccessToken fromJson(String json) {
        return OrgGsonBuilder.create().fromJson(json, OrgAccessToken.class);
    }
}
