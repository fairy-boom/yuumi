package org.okboom.yuumi.contacts.bean.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
/**
 * @author tookbra
 */
public class OrgGsonBuilder {

    private static final GsonBuilder INSTANCE = new GsonBuilder();

    static {
        INSTANCE.disableHtmlEscaping();
    }

    public static Gson create() {
        return INSTANCE.create();
    }

}
