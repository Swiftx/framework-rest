package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

public class MissingRequiredQueryParameter extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public MissingRequiredQueryParameter(String title) {
        super("missing-required-query-parameter", title);
    }

    /**
     * 创建异常
     */
    public static InvalidMetadata of() {
        return new InvalidMetadata("没有为此请求指定所需的查询参数。");
    }
}
