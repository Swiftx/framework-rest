package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

/**
 * 不支持请求中指定的 HTTP 标头之一。
 */
public class UnsupportedHeader extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public UnsupportedHeader(String title) {
        super("unsupported-header", title);
    }

    /**
     * 创建异常
     */
    public static UnsupportedHeader of() {
        return new UnsupportedHeader("不支持请求中指定的 HTTP 标头之一。");
    }
}
