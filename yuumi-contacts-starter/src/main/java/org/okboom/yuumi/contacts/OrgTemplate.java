package org.okboom.yuumi.contacts;

import lombok.Getter;
import org.okboom.yuumi.contacts.service.OrgDepartmentService;
import org.okboom.yuumi.contacts.service.OrgUserService;

/**
 * @author tookbra
 */
@Getter
public final class OrgTemplate {

    private final OrgDepartmentService orgDepartmentService;
    private final OrgUserService orgUserService;


    public OrgTemplate(OrgDepartmentService orgDepartmentService,
                       OrgUserService orgUserService) {
        this.orgDepartmentService = orgDepartmentService;
        this.orgUserService = orgUserService;
    }
}
