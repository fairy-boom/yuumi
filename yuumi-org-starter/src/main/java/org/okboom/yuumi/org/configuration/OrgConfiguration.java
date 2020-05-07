package org.okboom.yuumi.org.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author tookbra
 */
@Configuration
@EnableConfigurationProperties({OrgProperties.class})
public class OrgConfiguration {
}
