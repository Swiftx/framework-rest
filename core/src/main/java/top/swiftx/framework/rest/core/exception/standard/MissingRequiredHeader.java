package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

public class MissingRequiredHeader extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public MissingRequiredHeader(String title) {
        super("missing-required-header", title);
    }

    /**
     * 创建异常
     */
    public static MissingRequiredHeader of() {
        return new MissingRequiredHeader("未指定所需的 HTTP 标头。");
    }
}
