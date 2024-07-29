package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

/**
 * EmptyMetadataKey	错误的请求 (400)	元数据键-值对之一的键是空的。
 */
public class EmptyMetadataKey extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public EmptyMetadataKey(String title) {
        super("empty-metadata-key", title);
    }

    /**
     * 创建异常
     */
    public static EmptyMetadataKey of() {
        return new EmptyMetadataKey("元数据键-值对之一的键是空的。");
    }
}
