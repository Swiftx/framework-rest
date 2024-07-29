package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.NotFoundException;

/**
 * 指定的资源不存在。
 */
public class ResourceNotFound extends NotFoundException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public ResourceNotFound(String title) {
        super("resource-not-found", title);
    }

    /**
     * 创建异常
     */
    public static ResourceNotFound of() {
        return new ResourceNotFound("指定的资源不存在。");
    }
}

