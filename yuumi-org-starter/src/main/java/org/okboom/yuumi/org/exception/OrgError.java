package org.okboom.yuumi.org.exception;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tookbra
 */
@Data
public class OrgError implements Serializable {
    private static final long serialVersionUID = 4432013970211273751L;

    /**
     * 错误代码.
     */
    private int errorCode;

    /**
     * 错误信息.
     */
    private String errorMsg;
}
