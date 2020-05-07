package org.okboom.yuumi.redis.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author tookbra
 */
@Data
@ConfigurationProperties("spring.redis")
public class RedisProperties {
    /**
     * 序列化方式
     */
    private SerializerType serializerType = SerializerType.PROTO_STUFF;

    public enum SerializerType {
        /**
         * 默认:ProtoStuff 序列化
         */
        PROTO_STUFF,
        /**
         * json 序列化
         */
        JSON,
        /**
         * jdk 序列化
         */
        JDK
    }
}
