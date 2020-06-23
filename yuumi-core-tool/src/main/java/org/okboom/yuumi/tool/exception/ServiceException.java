package org.okboom.yuumi.tool.exception;


/**
 * 服务异常类
 * @author tookbra
 */
public class ServiceException extends RuntimeException {
    private static final long serialVersionUID = -4070188990962206832L;

    public ServiceException(String message) {
        super(message);
    }
}
