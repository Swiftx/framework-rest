package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

/**
 * 不支持多个条件标头。
 */
public class MultipleConditionHeadersNotSupported extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public MultipleConditionHeadersNotSupported(String title) {
        super("multiple-condition-headers-not-supported", title);
    }

    /**
     * 创建异常
     */
    public static MultipleConditionHeadersNotSupported of() {
        return new MultipleConditionHeadersNotSupported("不支持多个条件标头。");
    }
}
