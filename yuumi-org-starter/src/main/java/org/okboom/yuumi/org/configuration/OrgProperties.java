package org.okboom.yuumi.org.configuration;

import lombok.Data;

/**
 * @author tookbra
 */
@Data
@ConfigurationProperties(prefix = "yuumi.org")
public class OrgProperties {

    private String appKey;

    private String appSecret;

    /**
     * 重试次数，默认3次
     */
    private Integer retryTimes = 3;
}
