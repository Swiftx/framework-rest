package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

/**
 * 请求的 URI 不表示服务器上的任何资源。
 */
public class InvalidUri extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public InvalidUri(String title) {
        super("invalid-uri", title);
    }

    /**
     * 创建异常
     */
    public static InvalidUri of() {
        return new InvalidUri("请求的 URI 不表示服务器上的任何资源。");
    }
}
