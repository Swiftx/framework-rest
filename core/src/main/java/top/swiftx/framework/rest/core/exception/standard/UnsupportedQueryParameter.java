package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

/**
 * 不支持请求 URI 中指定的查询参数之一。
 */
public class UnsupportedQueryParameter extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public UnsupportedQueryParameter(String title) {
        super("unsupported-query-parameter", title);
    }

    /**
     * 创建异常
     */
    public static UnsupportedQueryParameter of() {
        return new UnsupportedQueryParameter("不支持请求 URI 中指定的查询参数之一。");
    }
}
