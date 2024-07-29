package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

public class MetadataTooLarge extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public MetadataTooLarge(String title) {
        super("metadata-too-large", title);
    }

    /**
     * 创建异常
     */
    public static MetadataTooLarge of() {
        return new MetadataTooLarge("指定的元数据大小超过允许的最大大小。");
    }
}
