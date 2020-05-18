package org.okboom.yuumi.contacts.cache;

/**
 * @author tookbra
 */
public class RedisOrgCache extends DefaultOrgCache {

    private static final String ACCESS_TOKEN_KEY = "ORG:ACCESS_TOKEN";

    public RedisOrgCache() {
        super("","");

    }

    @Override
    public String getAccessToken() {
        return null;
    }

    @Override
    public void setAccessToken(String accessToken) {

    }
}
