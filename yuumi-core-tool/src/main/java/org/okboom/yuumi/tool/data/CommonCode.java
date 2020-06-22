package org.okboom.yuumi.tool.data;

/**
 * 公共错误码枚举
 * @author tookbra
 */
public enum CommonCode implements ResultCode {
    /**
     * 成功
     */
    SUCCESS(200, "操作成功"),
    /**
     * 失败
     */
    ERROR(400, "业务异常");

    final int code;
    final String message;

    CommonCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public int getCode() {
        return 0;
    }
}
