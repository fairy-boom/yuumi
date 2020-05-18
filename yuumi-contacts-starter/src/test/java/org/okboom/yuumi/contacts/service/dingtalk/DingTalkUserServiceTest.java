package org.okboom.yuumi.contacts.service.dingtalk;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.okboom.yuumi.contacts.ContactsApplication;
import org.okboom.yuumi.contacts.OrgTemplate;
import org.okboom.yuumi.contacts.bean.OrgUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author tookbra
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ContactsApplication.class, properties = { "application.yml" })
public class DingTalkUserServiceTest {

    @Autowired
    OrgTemplate orgTemplate;

    @Test
    public void testListSimple() {
        List<OrgUser> orgUsers = orgTemplate.getOrgUserService().listSimple(1L, false);
        Assert.assertNotNull(orgUsers);
    }

    @Test
    public void testList() {
        List<OrgUser> orgUsers = orgTemplate.getOrgUserService().list(1L, false, null, null);
        Assert.assertNotNull(orgUsers);
    }
}
