package org.okboom.yuumi.tool.data;

import java.io.Serializable;

/**
 * @author tookbra
 */
public interface ResultCode extends Serializable {

    /**
     * 消息
     * @return
     */
    String getMessage();

    /**
     * 错误码
     * @return
     */
    int getCode();
}
