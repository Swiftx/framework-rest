package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

/**
 * 指定的元数据无效。 它包括不允许的字符。
 */
public class InvalidMetadata extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public InvalidMetadata(String title) {
        super("invalid-metadata", title);
    }

    /**
     * 创建异常
     */
    public static InvalidMetadata of() {
        return new InvalidMetadata("指定的元数据无效。 它包括不允许的字符。");
    }
}
