package org.okboom.yuumi.contacts.service.dingtalk;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.okboom.yuumi.contacts.bean.OrgUser;
import org.okboom.yuumi.contacts.bean.gson.OrgGsonBuilder;
import org.okboom.yuumi.contacts.cache.OrgCache;
import org.okboom.yuumi.contacts.constant.DingtalkApiConstant;
import org.okboom.yuumi.contacts.constant.OrgSource;
import org.okboom.yuumi.contacts.service.AbstractOrgService;
import org.okboom.yuumi.contacts.service.OrgUserService;

import java.util.List;

/**
 * @author tookbra
 */
public class DingtalkUserServiceImpl extends AbstractOrgService implements OrgUserService {

    public DingtalkUserServiceImpl(OrgCache orgCache) {
        super(orgCache, OrgSource.DINGTALK);
    }

    @Override
    public List<OrgUser> listSimple(Long departId, Boolean fetchChild) {
        String url = String.format(DingtalkApiConstant.User.USER_SIMPLE_LIST, departId);
        String result = get(url, null);
        JsonElement jsonElement = JsonParser.parseString(result);
        return OrgGsonBuilder.create()
                .fromJson(jsonElement.getAsJsonObject().get("userlist"),
                        new TypeToken<List<OrgUser>>() {}.getType()
                );
    }

    @Override
    public List<OrgUser> list(Long departId, Boolean fetchChild, Integer offset, Integer size) {
        String url = String.format(DingtalkApiConstant.User.USER_LIST, departId);
        String params = "";
        if(offset == null) {
            params += "&offset=" + 0;
        } else {
            params += "&offset=" + offset;
        }

        if(size == null) {
            params += "&size=" + 100;
        } else {
            params += "&size=" + size;
        }

        String result = get(url, params);
        JsonElement jsonElement = JsonParser.parseString(result);
        return OrgGsonBuilder.create()
                .fromJson(jsonElement.getAsJsonObject().get("userlist"),
                        new TypeToken<List<OrgUser>>() {}.getType()
                );
    }
}
