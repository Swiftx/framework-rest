package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

/**
 * 无法解析请求中的 URL。
 */
public class RequestUrlFailedToParse extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public RequestUrlFailedToParse(String title) {
        super("request-url-failed-to-parse", title);
    }

    /**
     * 创建异常
     */
    public static RequestUrlFailedToParse of() {
        return new RequestUrlFailedToParse("无法解析请求中的 URL。");
    }
}
