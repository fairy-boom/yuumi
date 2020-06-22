package org.okboom.yuumi.tool.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author tookbra
 */
@Data
@ToString
@NoArgsConstructor
public class ServiceResult<T> implements Serializable {
    private static final long serialVersionUID = 868401298415052677L;

    /**
     * 业务状态码
     */
    private int code;
    /**
     * 是否成功
     */
    private boolean success;
    /**
     * 返回对象
     */
    private T data;
    /**
     * 返回信息
     */
    private String message;


    /**
     * 构造
     * @param serviceCode
     * @param msg
     */
    public ServiceResult(CommonCode serviceCode, String msg) {
        this(serviceCode, null, msg);
    }

    /**
     * 构造
     * @param serviceCode
     * @param data
     */
    private ServiceResult(CommonCode serviceCode, T data) {
        this(serviceCode, data, serviceCode.getMessage());
    }

    /**
     * 构造
     * @param serviceCode
     * @param data
     * @param msg
     */
    private ServiceResult(CommonCode serviceCode, T data, String msg) {
        this(serviceCode.getCode(), data, msg);
    }

    /**
     * 构造
     * @param code
     * @param data
     * @param msg
     */
    private ServiceResult(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.message = msg;
        this.success = CommonCode.SUCCESS.code == code;
    }


    /**
     * 失败
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> ServiceResult<T> fail(String msg) {
        return new ServiceResult(CommonCode.ERROR, msg);
    }

    /**
     * 失败
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> ServiceResult<T> fail(int code, String msg) {
        return new ServiceResult(code, null, msg);
    }

    /**
     * 成功
     * @param <T>
     * @return
     */
    public static <T> ServiceResult<T> success() {
        return new ServiceResult(CommonCode.SUCCESS, CommonCode.SUCCESS.message);
    }
    /**
     * 成功
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> ServiceResult<T> success(String msg) {
        return new ServiceResult(CommonCode.SUCCESS, msg);
    }

}
