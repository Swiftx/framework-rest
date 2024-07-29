package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.ConflictException;

/**
 * 指定的资源类型与现有资源的类型不匹配。
 */
public class ResourceTypeMismatch extends ConflictException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public ResourceTypeMismatch(String title) {
        super("resource-type-mismatch", title);
    }

    /**
     * 创建异常
     */
    public static ResourceTypeMismatch of() {
        return new ResourceTypeMismatch("指定的资源类型与现有资源的类型不匹配。");
    }
}