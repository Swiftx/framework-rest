package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

/**
 * 为请求 URI 中的查询参数之一指定的值无效。
 */
public class InvalidQueryParameterValue extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public InvalidQueryParameterValue(String title) {
        super("invalid-query-parameter-value", title);
    }

    /**
     * 创建异常
     */
    public static InvalidQueryParameterValue of() {
        return new InvalidQueryParameterValue("为请求 URI 中的查询参数之一指定的值无效。");
    }
}
