package org.okboom.yuumi.contacts.configuration;

import org.okboom.yuumi.contacts.OrgTemplate;
import org.okboom.yuumi.contacts.cache.DefaultOrgCache;
import org.okboom.yuumi.contacts.cache.OrgCache;
import org.okboom.yuumi.contacts.cache.RedisOrgCache;
import org.okboom.yuumi.contacts.constant.OrgSource;
import org.okboom.yuumi.contacts.service.OrgDepartmentService;
import org.okboom.yuumi.contacts.service.OrgUserService;
import org.okboom.yuumi.contacts.service.dingtalk.DingtalkDepartServiceImpl;
import org.okboom.yuumi.contacts.service.dingtalk.DingtalkUserServiceImpl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author tookbra
 */
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties({ContactsProperties.class})
public class ContactsConfiguration {

    @Bean
    public OrgTemplate orgTemplate(OrgDepartmentService orgDepartmentService,
                                   OrgUserService orgUserService) {
        return new OrgTemplate(orgDepartmentService, orgUserService);
    }

    @Bean
    public OrgCache orgCache(ContactsProperties contactsProperties) {
        if(contactsProperties.getCache().equals("memory")) {
            return new DefaultOrgCache(contactsProperties.getAppKey(), contactsProperties.getAppSecret());
        } else if(contactsProperties.getCache().equals("redis")) {
            return new RedisOrgCache();
        }
        throw new RuntimeException("can not found cache support");
    }

    @Bean
    public OrgDepartmentService orgDepartmentService(OrgCache orgCache, ContactsProperties contactsProperties) {
        if(contactsProperties.getSource().equals(OrgSource.DINGTALK)) {
            return new DingtalkDepartServiceImpl(orgCache);
        }
        return null;
    }

    @Bean
    public OrgUserService orgUserService(OrgCache orgCache, ContactsProperties contactsProperties) {
        if(contactsProperties.getSource().equals(OrgSource.DINGTALK)) {
            return new DingtalkUserServiceImpl(orgCache);
        }
        return null;
    }
}
