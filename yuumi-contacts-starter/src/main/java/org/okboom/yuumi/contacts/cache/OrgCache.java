package org.okboom.yuumi.contacts.cache;

import java.util.concurrent.locks.Lock;

/**
 * @author tookbra
 */
public interface OrgCache {

    /**
     * 获取access_token
     * @return access_token
     */
    String getAccessToken();

    /**
     * 设置access_token
     * @param accessToken access_token
     */
    void setAccessToken(String accessToken);

    String getAppKey();

    String getAppSecret();

    /**
     * 获取token锁
     * @return
     */
    Lock getAccessTokenLock();

    /**
     * 更新凭证
     * @param accessToken 凭证
     * @param expiresInSeconds 过期时间，以秒为单位
     */
    void updateAccessToken(String accessToken, int expiresInSeconds);

}
