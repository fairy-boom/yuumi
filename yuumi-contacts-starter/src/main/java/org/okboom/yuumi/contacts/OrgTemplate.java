package org.okboom.yuumi.contacts;

import lombok.Getter;
import org.okboom.yuumi.contacts.cache.OrgCache;
import org.okboom.yuumi.contacts.service.AbstractOrgService;
import org.okboom.yuumi.contacts.service.OrgDepartmentService;
import org.okboom.yuumi.contacts.service.OrgRoleService;
import org.okboom.yuumi.contacts.service.OrgUserService;

/**
 * @author tookbra
 */
@Getter
public final class OrgTemplate {

    private final OrgDepartmentService orgDepartmentService;
    private final OrgUserService orgUserService;
    private final OrgRoleService orgRoleService;


    public OrgTemplate(OrgDepartmentService orgDepartmentService,
                       OrgUserService orgUserService,
                       OrgRoleService orgRoleService) {
        this.orgDepartmentService = orgDepartmentService;
        this.orgUserService = orgUserService;
        this.orgRoleService = orgRoleService;
    }
}
