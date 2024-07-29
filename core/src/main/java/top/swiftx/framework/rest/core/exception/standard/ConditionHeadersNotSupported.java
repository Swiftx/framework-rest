package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

/**
 * 不支持条件标头。
 */
public class ConditionHeadersNotSupported extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public ConditionHeadersNotSupported(String title) {
        super("condition-headers-not-supported", title);
    }

    /**
     * 创建异常
     */
    public static ConditionHeadersNotSupported of() {
        return new ConditionHeadersNotSupported("不支持条件标头。");
    }
}
