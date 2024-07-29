package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.PayloadTooLargeException;

/**
 * 请求正文大小超过允许的最大大小。
 */
public class RequestBodyTooLarge extends PayloadTooLargeException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public RequestBodyTooLarge(String title) {
        super("request-body-too-large", title);
    }

    /**
     * 创建异常
     */
    public static RequestBodyTooLarge of() {
        return new RequestBodyTooLarge("请求正文大小超过允许的最大大小。");
    }
}