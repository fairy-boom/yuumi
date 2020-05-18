package org.okboom.yuumi.contacts.service;

import cn.hutool.http.HttpRequest;
import org.okboom.yuumi.contacts.bean.common.OrgAccessToken;
import org.okboom.yuumi.contacts.cache.OrgCache;
import org.okboom.yuumi.contacts.constant.DingtalkApiConstant;
import org.okboom.yuumi.contacts.constant.OrgSource;
import org.okboom.yuumi.contacts.bean.common.OrgError;
import org.okboom.yuumi.contacts.exception.OrgException;

import java.util.concurrent.locks.Lock;

/**
 * @author tookbra
 */
public abstract class AbstractOrgService implements OrgService {

    private final OrgCache orgCache;
    private final OrgSource orgSource;

    protected final Object accessTokenRefreshLock = new Object();

    public AbstractOrgService(OrgCache orgCache, OrgSource orgSource) {
        this.orgCache = orgCache;
        this.orgSource = orgSource;
    }

    @Override
    public String getAccessToken() {
        Lock lock = orgCache.getAccessTokenLock();
        try {
            lock.lock();
            String url = orgSource.equals(OrgSource.DINGTALK) ? DingtalkApiConstant.GET_TOKEN : "";
            String result = HttpRequest.get(String.format(url, orgCache.getAppKey(), orgCache.getAppSecret())).execute().body();
            OrgError error = OrgError.fromJson(result);
            if (error.getErrorCode() != 0) {
                throw new OrgException(error);
            }
            OrgAccessToken accessToken = OrgAccessToken.fromJson(result);
            orgCache.updateAccessToken(accessToken.getAccessToken(), accessToken.getExpiresIn());
            return accessToken.getAccessToken();
        } finally {
            lock.unlock();
        }
    }

    public String get(String url, String data) {
        return execute(HttpRequest.get(url).body(data));
    }

    public String post(String url, String data) {
        return execute(HttpRequest.post(url).body(data));
    }

    private String execute(HttpRequest httpRequest) {
        String accessToken = getAccessToken();
        String url = httpRequest.getUrl();
        String uriWithAccessToken = url + (url.contains("?") ? "&" : "?") + "access_token=" + accessToken;
        String result = httpRequest.setUrl(uriWithAccessToken).execute().body();
        OrgError orgError = OrgError.fromJson(result);
        if(orgError.getErrorCode() != 0) {
            throw new OrgException(orgError);
        }
        return result;
    }
}
