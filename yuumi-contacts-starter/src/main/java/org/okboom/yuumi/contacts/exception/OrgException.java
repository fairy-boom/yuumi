package org.okboom.yuumi.contacts.exception;

import org.okboom.yuumi.contacts.bean.common.OrgError;

/**
 * @author tookbra
 */
public class OrgException extends RuntimeException {
    private static final long serialVersionUID = -7575170919426252783L;

    private OrgError error;

    public OrgException(OrgError error) {
        super(error.toString());
        this.error = error;
    }
}
