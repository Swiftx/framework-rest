package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

public class OutOfRangeQueryParameterValue extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public OutOfRangeQueryParameterValue(String title) {
        super("out-of-range-query-parameter-value", title);
    }

    /**
     * 创建异常
     */
    public static OutOfRangeQueryParameterValue of() {
        return new OutOfRangeQueryParameterValue("在请求 URI 中指定的查询参数超过了允许范围。");
    }
}
