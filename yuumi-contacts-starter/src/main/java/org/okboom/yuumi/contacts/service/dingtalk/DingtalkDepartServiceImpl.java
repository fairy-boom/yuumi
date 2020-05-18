package org.okboom.yuumi.contacts.service.dingtalk;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.okboom.yuumi.contacts.bean.gson.OrgGsonBuilder;
import org.okboom.yuumi.contacts.cache.OrgCache;
import org.okboom.yuumi.contacts.constant.OrgSource;
import org.okboom.yuumi.contacts.service.AbstractOrgService;
import org.okboom.yuumi.contacts.service.OrgDepartmentService;
import org.okboom.yuumi.contacts.bean.OrgDepartment;
import org.okboom.yuumi.contacts.constant.DingtalkApiConstant;

import java.util.List;

/**
 * @author tookbra
 */
public class DingtalkDepartServiceImpl extends AbstractOrgService implements OrgDepartmentService {

    public DingtalkDepartServiceImpl(OrgCache orgCache) {
        super(orgCache, OrgSource.DINGTALK);
    }

    @Override
    public List<OrgDepartment> list(Long id) {
        String url = DingtalkApiConstant.Department.DEPARTMENT_LIST;
        String result = get(url, null);
        JsonElement jsonElement = JsonParser.parseString(result);
        return OrgGsonBuilder.create()
                .fromJson(jsonElement.getAsJsonObject().get("department"),
                        new TypeToken<List<OrgDepartment>>() {}.getType()
                );
    }


}
