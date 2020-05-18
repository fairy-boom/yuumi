package org.okboom.yuumi.contacts.cache;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author tookbra
 */
public class DefaultOrgCache implements OrgCache {

    protected volatile String accessToken;

    private volatile String appKey;
    private volatile String appSecret;

    protected Lock accessTokenLock = new ReentrantLock();

    public DefaultOrgCache(String appKey, String appSecret) {
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    @Override
    public String getAccessToken() {
        return this.accessToken;
    }

    @Override
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String getAppKey() {
        return this.appKey;
    }

    @Override
    public String getAppSecret() {
        return this.appSecret;
    }

    @Override
    public Lock getAccessTokenLock() {
        return accessTokenLock;
    }

    @Override
    public void updateAccessToken(String accessToken, int expiresInSeconds) {
        this.accessToken = accessToken;
    }
}
