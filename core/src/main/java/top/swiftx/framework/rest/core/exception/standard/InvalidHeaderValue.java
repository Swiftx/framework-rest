package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

/**
 * 请求头值无效
 */
public class InvalidHeaderValue extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public InvalidHeaderValue(String title) {
        super("invalid-header-value", title);
    }

    /**
     * 创建异常
     */
    public static InvalidHeaderValue of() {
        return new InvalidHeaderValue("为 HTTP 标头之一提供的值的格式不正确。");
    }
}
