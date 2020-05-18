package org.okboom.yuumi.contacts.configuration;

import lombok.Data;
import org.okboom.yuumi.contacts.constant.OrgSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author tookbra
 */
@Data
@Validated
@ConfigurationProperties(prefix = "yuumi.contacts")
public class ContactsProperties {

    @NotEmpty
    private String appKey;

    @NotEmpty
    private String appSecret;

    /**
     * 重试次数，默认3次
     */
    private Integer retryTimes = 3;

    @NotNull
    private OrgSource source;

    /**
     * 缓存类型
     * memory, redis
     */
    @NotEmpty
    private String cache = "memory";
}
