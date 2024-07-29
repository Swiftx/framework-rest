package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.ConflictException;

/**
 * 指定的资源已存在。
 */
public class ResourceAlreadyExists extends ConflictException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public ResourceAlreadyExists(String title) {
        super("resource-already-exists", title);
    }

    /**
     * 创建异常
     */
    public static ResourceAlreadyExists of() {
        return new ResourceAlreadyExists("指定的资源已存在。");
    }
}
