package org.okboom.yuumi.contacts.constant;

/**
 * @author tookbra
 */
public final class DingtalkApiConstant {
    public static final String DEFAULT_BASE_URL = "https://oapi.dingtalk.com";
    public static final String GET_TOKEN = DEFAULT_BASE_URL + "/gettoken?appkey=%s&appsecret=%s";

    public static class Department {
        public static final String DEPARTMENT_CREATE = "/cgi-bin/department/create";
        public static final String DEPARTMENT_UPDATE = "/cgi-bin/department/update";
        public static final String DEPARTMENT_DELETE = "/cgi-bin/department/delete?id=%d";
        public static final String DEPARTMENT_LIST = DEFAULT_BASE_URL + "/department/list";
    }

    public static class Tag {
        public static final String TAG_CREATE = "/cgi-bin/tag/create";
        public static final String TAG_UPDATE = "/cgi-bin/tag/update";
        public static final String TAG_DELETE = "/cgi-bin/tag/delete?tagid=%s";
        public static final String TAG_LIST = "/cgi-bin/tag/list";
        public static final String TAG_GET = "/cgi-bin/tag/get?tagid=%s";
        public static final String TAG_ADD_TAG_USERS = "/cgi-bin/tag/addtagusers";
        public static final String TAG_DEL_TAG_USERS = "/cgi-bin/tag/deltagusers";
    }

    public static class User {
        public static final String USER_LIST = DEFAULT_BASE_URL + "/user/listbypage?department_id=%s";
        public static final String USER_SIMPLE_LIST = DEFAULT_BASE_URL + "/user/simplelist?department_id=%s";
    }
}
