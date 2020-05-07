package org.okboom.yuumi.org.constant;

/**
 * @author tookbra
 */
public final class DingtalkApiConstant {
    public static final String DEFAULT_CP_BASE_URL = "https://oapi.dingtalk.com";
    public static final String GET_TOKEN = "/gettoken?appkey=%s&appsecret=%s";

    public static class Department {
        public static final String DEPARTMENT_CREATE = "/cgi-bin/department/create";
        public static final String DEPARTMENT_UPDATE = "/cgi-bin/department/update";
        public static final String DEPARTMENT_DELETE = "/cgi-bin/department/delete?id=%d";
        public static final String DEPARTMENT_LIST = DEFAULT_CP_BASE_URL + "/department/list";
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
        public static final String USER_AUTHENTICATE = "/cgi-bin/user/authsucc?userid=";
        public static final String USER_CREATE = "/cgi-bin/user/create";
        public static final String USER_UPDATE = "/cgi-bin/user/update";
        public static final String USER_DELETE = "/cgi-bin/user/delete?userid=";
        public static final String USER_BATCH_DELETE = "/cgi-bin/user/batchdelete";
        public static final String USER_GET = "/cgi-bin/user/get?userid=";
        public static final String USER_LIST = "/cgi-bin/user/list?department_id=";
        public static final String USER_SIMPLE_LIST = "/cgi-bin/user/simplelist?department_id=";
        public static final String BATCH_INVITE = "/cgi-bin/batch/invite";
        public static final String USER_CONVERT_TO_OPENID = "/cgi-bin/user/convert_to_openid";
        public static final String USER_CONVERT_TO_USERID = "/cgi-bin/user/convert_to_userid";
        public static final String GET_USER_ID = "/cgi-bin/user/getuserid";
        public static final String GET_EXTERNAL_CONTACT = "/cgi-bin/crm/get_external_contact?external_userid=";
    }
}
