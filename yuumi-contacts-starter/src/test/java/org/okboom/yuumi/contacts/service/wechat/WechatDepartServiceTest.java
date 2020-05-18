package org.okboom.yuumi.contacts.service.wechat;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.okboom.yuumi.contacts.ContactsApplication;
import org.okboom.yuumi.contacts.OrgTemplate;
import org.okboom.yuumi.contacts.bean.OrgDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author tookbra
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ContactsApplication.class, properties = { "application.yml" })
public class WechatDepartServiceTest {

    @Autowired
    OrgTemplate orgTemplate;

    @Test
    public void testList() {
        List<OrgDepartment> departments = orgTemplate.getOrgDepartmentService().list(null);
        Assert.assertNotNull(departments);
    }
}
